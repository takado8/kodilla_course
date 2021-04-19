package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SocialTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User user1 = new Millenials("John1");
        User user2 = new YGeneration("Ted2");
        User user3 = new ZGeneration("Bob3");
        //when
        var resp1 = user1.sharePost();
        var resp2 = user2.sharePost();
        var resp3 = user3.sharePost();
        //then
        assertEquals("share on snapchat", resp1);
        assertEquals("share on twitter", resp2);
        assertEquals("share on facebook", resp3);
    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User user1 = new Millenials("John1");
        User user2 = new YGeneration("Ted2");
        User user3 = new ZGeneration("Bob3");
        //when
        user1.setSocialPublisher(new FacebookPublisher());
        var resp1 = user1.sharePost();
        user2.setSocialPublisher(new FacebookPublisher());
        var resp2 = user2.sharePost();
        user3.setSocialPublisher(new SnapchatPublisher());
        var resp3 = user3.sharePost();
        //then
        assertEquals("share on facebook", resp1);
        assertEquals("share on facebook", resp2);
        assertEquals("share on snapchat", resp3);
    }
}
