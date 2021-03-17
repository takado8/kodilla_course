package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        var canFly = flightsMap.get(flight.getArrivalAirport());
        if (canFly != null) {
            return canFly;
        }
        else {
            throw new RouteNotFoundException("Arrival airport not found.");
        }
    }
}



