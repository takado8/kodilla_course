package com.kodilla.good.patterns.challenges.food2door.order.result;

public class OrderResultImpl implements OrderResult {
    private final boolean success;
    private final String message;

    public OrderResultImpl(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
