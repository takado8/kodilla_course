package com.kodilla.good.patterns.challenges.food2door.product;

import static com.kodilla.good.patterns.challenges.food2door.product.Constants.CARROT_ID;
import static com.kodilla.good.patterns.challenges.food2door.product.Constants.CARROT_NAME;

public class Carrot implements Product {
    private final String name = CARROT_NAME;
    private final int id = CARROT_ID;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
