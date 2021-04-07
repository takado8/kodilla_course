package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.OrderImpl;
import com.kodilla.good.patterns.challenges.food2door.order.OrderExecutor;
import com.kodilla.good.patterns.challenges.food2door.producer.OrderService;
import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.product.Carrot;

public class food2doorMain {
    public static void main(String[] args) {
        OrderExecutor orderExecutor = new OrderExecutor();
        Order order = new OrderImpl(80, new Carrot());
        OrderService orderService = new ExtraFoodShop();
        orderExecutor.executeOrder(orderService, order);
    }
}
