package com.kodilla.good.patterns.challenges.flight_searcher;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightSearcherTestSuite {
    static final String AIRPORT_WARSAW = "WARSAW";
    static final String AIRPORT_LONDON = "LONDON";
    static final String AIRPORT_BERLIN = "BERLIN";
    static final String AIRPORT_PARIS = "PARIS";

    @Test
    void testFindFlightsTo() {
        // given
        var flights = generateFlightsList();
        FlightSearcher flightSearcher = new FlightSearcher();
        // when
        var result = flightSearcher.findFlightsTo(AIRPORT_LONDON, flights);
        // then
        System.out.println(result);
        assertEquals(AIRPORT_LONDON, result.get(0).getArrivalAirport());
    }

    @Test
    void testFindFlightsFrom() {
        // given
        var flights = generateFlightsList();
        FlightSearcher flightSearcher = new FlightSearcher();
        // when
        var result = flightSearcher.findFlightsFrom(AIRPORT_WARSAW, flights);
        // then
        System.out.println(result);
        assertEquals(AIRPORT_WARSAW, result.get(0).getDepartureAirport());
    }

    @Test
    void testFindConnectingFlights() {
        // given
        var flights = generateFlightsList();
        FlightSearcher flightSearcher = new FlightSearcher();
        // when
        var result = flightSearcher.findConnectingFlight(AIRPORT_WARSAW, AIRPORT_LONDON, flights);
        // then
        System.out.println(result);
        assertEquals(AIRPORT_LONDON, result.get(0).getArrivalAirport());
        assertEquals(AIRPORT_WARSAW, result.get(0).getDepartureAirport());

    }

    List<Flight> generateFlightsList() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(AIRPORT_WARSAW, AIRPORT_BERLIN));
        flights.add(new Flight(AIRPORT_BERLIN, AIRPORT_LONDON));
        flights.add(new Flight(AIRPORT_WARSAW, AIRPORT_PARIS));
        flights.add(new Flight(AIRPORT_PARIS, AIRPORT_WARSAW));
        return flights;
    }
}
