package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape() {
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        switch (chosen) {
            case 0:
                return new Triangle();
            case 1:
                return new Circle();
            default:
                return new Square();
        }
    }
}

