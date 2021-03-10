package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        // given
        // europe
        var nb_of_people = BigDecimal.ONE;
        Country pl = new Country(nb_of_people);
        Country de = new Country(nb_of_people);
        Country uk = new Country(nb_of_people);
        List<Country> countries_eu = new ArrayList<>();
        countries_eu.add(pl);
        countries_eu.add(de);
        countries_eu.add(uk);
        Continent europe = new Continent(countries_eu);
        // asia
        Country china = new Country(nb_of_people);
        Country japan = new Country(nb_of_people);
        List<Country> countries_asia = new ArrayList<>();
        countries_asia.add(china);
        countries_asia.add(japan);
        Continent asia = new Continent(countries_asia);
        // world
        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        World world = new World(continents);
        // when
        var actualPeopleQuantity = world.getPeopleQuantity();
        // than
        assertEquals(new BigDecimal("5"),actualPeopleQuantity);
    }
}
