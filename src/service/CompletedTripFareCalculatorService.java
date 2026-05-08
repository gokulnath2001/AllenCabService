package service;

import Entity.Trip;

public class CompletedTripFareCalculatorService implements FareCalculatorService {
    @Override
    public long calculateFare(Trip trip) {
        return trip.getTripBasedFareMultiplier(trip.getVehicle().totalFarePerTrip(trip.getKilometers()));
    }
}
