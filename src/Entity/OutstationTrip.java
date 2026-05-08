package Entity;

import enums.TripStatus;
import enums.TripType;

import java.time.LocalDateTime;

public class OutstationTrip extends Trip {


    public OutstationTrip(Vehicle vehicle, long kilometers, TripStatus tripStatus, LocalDateTime tripStartTime, LocalDateTime tripEndTime) {
        super(TripType.OUTSTATION, vehicle,  kilometers, tripStatus,  tripStartTime, tripEndTime);
    }

    @Override
    public long getTripBasedFareMultiplier(Long fare) {
        return 2 * fare;
    }

}
