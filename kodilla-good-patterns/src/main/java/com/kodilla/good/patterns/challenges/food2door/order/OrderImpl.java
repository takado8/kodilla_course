package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.product.Product;

public class OrderImpl implements Order {
    private final double quantity;
    private final Product product;

    public OrderImpl(double quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
