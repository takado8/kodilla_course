package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {
        var sc = new SecondChallenge();
        String result = "";
        try {
            result = sc.probablyIWillThrowException(5.0,0.7);
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println(result);
        }
    }
}
