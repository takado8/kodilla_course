package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final int burgers;
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(String bun, String sauce, List<String> ingredients, int burgers) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
        this.burgers = burgers;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "burgers=" + burgers +
                ", bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private int burgers;
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder bun(String bunType) {
            this.bun = bunType;
            return this;
        }

        public BigmacBuilder sauce(String sauceType) {
            this.sauce = sauceType;
            return this;
        }

        public BigmacBuilder ingredient(String ingredientType) {
            this.ingredients.add(ingredientType);
            return this;
        }

        public Bigmac build () {
            if (bun != null) {
                return new Bigmac(this.bun, this.sauce, this.ingredients, this.burgers);
            } else {
                System.out.println("Burger must have buns selected.");
                return null;
            }
        }
    }
}
