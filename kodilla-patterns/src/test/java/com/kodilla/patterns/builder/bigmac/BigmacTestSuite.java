package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilderIngredientsNb() {
        // given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bun("classic")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("lettuce")
                .ingredient("pickle")
                .ingredient("onion")
                .build();
        System.out.println(burger);
        // when
        var ingredientsNb = burger.getIngredients().size();
        // then
        assertEquals(3, ingredientsNb);
    }

    @Test
    void testBigmacBuilderNoBunNull() {
        // given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("BBQ")
                .ingredient("lettuce")
                .ingredient("pickle")
                .ingredient("onion")
                .build();
        System.out.println(burger);
        // then
        assertNull(burger);
    }

    @Test
    void testBigmacBuilderSauce() {
        // given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bun("classic")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("lettuce")
                .ingredient("pickle")
                .ingredient("onion")
                .build();
        System.out.println(burger);
        // when
        var sauce = burger.getSauce();
        // then
        assertEquals("BBQ", sauce);
    }
}
