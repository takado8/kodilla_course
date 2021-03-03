package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("textextetxte"));
//
//        ExpressionExecutor executor = new ExpressionExecutor();
//
//        //noinspection Convert2MethodRef
//        executor.executeExpression(2,3, (a, b) -> a + b);
//        executor.executeExpression(2,3, (a, b) -> a * b);
//        executor.executeExpression(2,3, (a, b) -> a - b);
//        executor.executeExpression(2,3, (a, b) -> a / b);
//
//        executor.executeExpression(2,3, FunctionalCalculator::addAToB);
//        executor.executeExpression(2,3, FunctionalCalculator::multiplyAByB);
//        executor.executeExpression(2,3, FunctionalCalculator::divideAByB);
//        executor.executeExpression(2,3, FunctionalCalculator::subBFromA);

//        PoemBeautifier beautifier = new PoemBeautifier();
//        beautifier.beautify("LaLaLaLa", s -> "ABC" + s + "ABC");
//        beautifier.beautify("LaLaLaLa", s -> s.toLowerCase(Locale.ROOT));
//        beautifier.beautify("Pompompom", s -> s.substring(3));
//        beautifier.beautify("txtxtxt", s -> "_ _ _" + s + "_ _ _");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
