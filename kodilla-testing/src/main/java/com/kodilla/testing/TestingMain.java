package com.kodilla.testing;
import com.kodilla.testing.Calculator.Calculator;
import java.util.Random;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Test - pierwszy test jednostkowy:");
        Random rand = new Random();
        boolean testOk = true;
        for(int i=0; i<1000000; i++) {
            int a = rand.nextInt();
            int b = rand.nextInt();
            if(a+b != Calculator.add(a,b)) {
                System.out.println("Fail: " + a + "+" + b + "!=" + Calculator.add(a,b));
                testOk = false;
                break;
            }
            if(a-b != Calculator.subtract(a,b)) {
                System.out.println("Fail: " + a + "+" + b + "!=" + Calculator.subtract(a, b));
                testOk = false;
                break;
            }
        }
        if (testOk) {
            System.out.println("Test OK");
        }

    }
}