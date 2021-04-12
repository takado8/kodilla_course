package com.kodilla.good.patterns.challenges.flight_searcher;

import java.util.List;

public class ConnectingFlight extends Flight {
    private final List<String> transitAirports;

    public ConnectingFlight(String departureAirport, String arrivalAirport, List<String> transitAirports) {
        super(departureAirport, arrivalAirport);
        this.transitAirports = transitAirports;
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "id=" + id +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", transitAirports=" + transitAirports +
                '}';
    }
}
