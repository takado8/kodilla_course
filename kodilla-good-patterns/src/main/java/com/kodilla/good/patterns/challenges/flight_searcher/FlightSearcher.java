package com.kodilla.good.patterns.challenges.flight_searcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    public List<Flight> findFlightsTo(String arrivalAirport, List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsFrom(String departureAirport, List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<ConnectingFlight> findConnectingFlight(String departureAirport, String arrivalAirport, List<Flight> flights) {
        var flightsFrom = findFlightsFrom(departureAirport, flights);
        var flightsTo = findFlightsTo(arrivalAirport, flights);

        List<ConnectingFlight> connectingFlights = new ArrayList<>();

        for (var flightFrom : flightsFrom){
            for (var flightTo : flightsTo) {
                if (flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())){
                    List<String> transitAirports = new ArrayList<>();
                    transitAirports.add(flightFrom.getArrivalAirport());
                    connectingFlights.add(new ConnectingFlight(departureAirport,arrivalAirport,transitAirports));
                }
            }
        }
        return connectingFlights;
    }
}
