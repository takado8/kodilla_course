package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public class ZGeneration extends User {
    public ZGeneration(String userName) {
        super(userName);
        setSocialPublisher(new FacebookPublisher());
    }
}
