package Entity;

import enums.TripStatus;
import enums.TripType;

import java.time.LocalDateTime;

public class IntracityTrip extends Trip {


    public IntracityTrip(Vehicle vehicle, long kilometers, TripStatus tripStatus, LocalDateTime tripStartTime, LocalDateTime tripEndTime) {
        super(TripType.INTRACITY, vehicle, kilometers, tripStatus,   tripStartTime, tripEndTime);
    }

    @Override
    public long getTripBasedFareMultiplier(Long fare) {
        return fare;
    }

}
