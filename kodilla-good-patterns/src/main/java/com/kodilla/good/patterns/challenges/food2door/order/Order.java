package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.product.Product;

public interface Order {
    double getQuantity();
    Product getProduct();
}
