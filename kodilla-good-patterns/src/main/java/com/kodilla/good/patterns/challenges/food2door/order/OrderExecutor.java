package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;
import com.kodilla.good.patterns.challenges.food2door.producer.OrderService;

public class OrderExecutor {
    public void executeOrder(OrderService producer, Order order) {
        OrderResult result = producer.process(order);
        System.out.println("order result '" + result.isSuccess() +"' for producer: " + producer.getName());
        System.out.println(result.getMessage());

    }
}
