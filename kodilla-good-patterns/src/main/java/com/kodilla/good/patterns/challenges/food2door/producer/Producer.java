package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;

public abstract class Producer implements OrderService {
    private final String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract OrderResult process(Order order);
}
