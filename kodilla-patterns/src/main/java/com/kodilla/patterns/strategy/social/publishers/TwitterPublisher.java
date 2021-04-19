package com.kodilla.patterns.strategy.social.publishers;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "share on twitter";
    }
}
