package service;

import Entity.Trip;
import enums.TripStatus;

public class CancelledTripFareCalculatorService implements FareCalculatorService {
    @Override
    public long calculateFare(Trip trip) {
        if(TripStatus.CANCELED_DRIVER.equals(trip.getTripStatus())) {
            return -10;
        }
        if(TripStatus.CANCELLED_CUSTOMER.equals(trip.getTripStatus())) {
            return 10;
        }
        return 0;
    }
}
