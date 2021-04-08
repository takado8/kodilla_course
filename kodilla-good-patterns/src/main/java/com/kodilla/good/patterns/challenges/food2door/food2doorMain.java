package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.OrderExecutor;
import com.kodilla.good.patterns.challenges.food2door.order.OrderImpl;
import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producer.OrderService;
import com.kodilla.good.patterns.challenges.food2door.product.Carrot;
import com.kodilla.good.patterns.challenges.food2door.product.Lettuce;

import java.util.LinkedList;
import java.util.List;

public class food2doorMain {
    public static void main(String[] args) {
        OrderExecutor orderExecutor = new OrderExecutor();

        List<Order> orders = new LinkedList<>();
        Order carrotOrder = new OrderImpl(80, new Carrot());
        Order lettuceOrder = new OrderImpl(40, new Lettuce());
        orders.add(carrotOrder);
        orders.add(lettuceOrder);

        List<OrderService> orderServices = new LinkedList<>();
        OrderService extraFoodShop = new ExtraFoodShop();
        OrderService healthyShop = new HealthyShop();
        orderServices.add(extraFoodShop);
        orderServices.add(healthyShop);

        orderExecutor.executeOrders(orderServices, orders);
    }
}
