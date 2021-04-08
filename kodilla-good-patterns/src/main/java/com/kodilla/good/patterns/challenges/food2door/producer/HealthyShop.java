package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResultImpl;

public class HealthyShop extends Producer {
    private final static String NAME = "HealthyShop";

    private final static String ORDER_OK_MSG = "Order approved for product ";
    private final static String ORDER_TOO_SMALL_MSG = "Rejected: order too small for product ";
    public final static int MIN_ORDER_SIZE = 45;

    public HealthyShop() {
        super(NAME);
    }

    @Override
    public OrderResult process(Order order) {
        if (order.getQuantity() < MIN_ORDER_SIZE) {
            return new OrderResultImpl(false, ORDER_TOO_SMALL_MSG + order.getProduct().getName());
        }
        return new OrderResultImpl(true, ORDER_OK_MSG + order.getProduct().getName());
    }
}
