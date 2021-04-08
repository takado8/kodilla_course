package com.kodilla.good.patterns.challenges.food2door.product;

import static com.kodilla.good.patterns.challenges.food2door.product.Constants.LETTUCE_ID;
import static com.kodilla.good.patterns.challenges.food2door.product.Constants.LETTUCE_NAME;

public class Lettuce implements Product {
    private final String name = LETTUCE_NAME;
    private final int id = LETTUCE_ID;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
