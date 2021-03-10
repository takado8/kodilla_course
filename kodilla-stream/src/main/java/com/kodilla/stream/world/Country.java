package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    BigDecimal people_nb;

    public Country(BigDecimal people_nb) {
        this.people_nb = people_nb;
    }

    BigDecimal getPeopleQuantity(){
        return people_nb;
    }
}
