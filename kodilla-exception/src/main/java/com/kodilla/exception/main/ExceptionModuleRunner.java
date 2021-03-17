package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearcher;
import com.kodilla.exception.test.RouteNotFoundException;


public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight("Warsaw", "London");

        try {
            boolean canFly = flightSearcher.findFlight(flight1);
            System.out.println(canFly);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Following exception occurred: " + e);
        }

    }
}