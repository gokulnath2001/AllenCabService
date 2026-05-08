package Entity;

import enums.VehicleType;

public class LuxuryVehicle extends Vehicle {

    public LuxuryVehicle(String vehicleNumber, String VehicleModel) {
        super(VehicleType.Luxury, vehicleNumber, VehicleModel);
    }

    @Override
    public Long totalFarePerTrip(long kilometer) {
        return 15*kilometer;
    }
}
