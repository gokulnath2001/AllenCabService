package Factory;

import Entity.IntracityTrip;
import Entity.OutstationTrip;
import Entity.Trip;
import Entity.Vehicle;
import enums.TripStatus;
import enums.TripType;

import java.time.LocalDateTime;

public class TripFactory {

    public Trip getTrip(TripType tripType, Vehicle vehicle, long kilometers, TripStatus tripStatus, LocalDateTime tripStartTime, LocalDateTime tripEndTime) {

        Trip trip = null;

        switch (tripType) {
            case OUTSTATION -> trip = new OutstationTrip(vehicle, kilometers, tripStatus, tripStartTime, tripEndTime);
            case INTRACITY -> trip = new IntracityTrip(vehicle, kilometers, tripStatus, tripStartTime, tripEndTime);
        }

        return trip;
    }
}
