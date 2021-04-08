package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;
import com.kodilla.good.patterns.challenges.food2door.producer.OrderService;

import java.util.List;

public class OrderExecutor {
    public void executeOrders(List<OrderService> producers, List<Order> orders) {
        for (var order : orders) {
            for (var producer : producers) {
                OrderResult result = producer.process(order);
                System.out.println("order result '" + result.isSuccess() +
                        "' for producer: " + producer.getName());
                System.out.println(result.getMessage());
                if (result.isSuccess()){
                    break;
                }
            }
        }
    }
}
