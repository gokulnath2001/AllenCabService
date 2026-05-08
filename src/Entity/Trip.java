package Entity;

import enums.TripStatus;
import enums.TripType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Trip {

    private TripType tripType;
    private Vehicle vehicle;
    private long kilometers;
    private TripStatus tripStatus;
    private LocalDateTime tripStartTime;
    private LocalDateTime tripEndTime;

    public Trip(TripType tripType, Vehicle vehicle, long kilometers,  TripStatus tripStatus, LocalDateTime tripStartTime, LocalDateTime tripEndTime) {
        this.tripType = tripType;
        this.vehicle = vehicle;
        this.kilometers = kilometers;
        this.tripStatus = tripStatus;
        this.tripStartTime = tripStartTime;
        this.tripEndTime = tripEndTime;

    }

    public abstract long getTripBasedFareMultiplier(Long fare);

}
