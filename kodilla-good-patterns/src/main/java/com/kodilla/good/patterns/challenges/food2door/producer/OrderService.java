package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;

public interface OrderService {
    OrderResult process(Order order);
    String getName();
}
