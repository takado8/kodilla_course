package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResult;
import com.kodilla.good.patterns.challenges.food2door.order.result.OrderResultImpl;

import static com.kodilla.good.patterns.challenges.food2door.product.Constants.CARROT_ID;


public class ExtraFoodShop extends Producer {
    private final static String NAME = "ExtraFoodShop";

    private final static String ORDER_OK_MSG = "Order approved for product ";
    private final static String ORDER_TOO_BIG_MSG = "Rejected: order too big for product ";

    public ExtraFoodShop() {
        super(NAME);
    }

    @Override
    public OrderResult process(Order order) {
        var quantity = order.getQuantity();
        if (order.getProduct().getId() == CARROT_ID && quantity > 50) {
            return new OrderResultImpl(false, ORDER_TOO_BIG_MSG + order.getProduct().getName());
        }
        return new OrderResultImpl(true, ORDER_OK_MSG + order.getProduct().getName());
    }
}
