package Entity;

import enums.VehicleType;

public class PremiumVehicle extends Vehicle {


    public PremiumVehicle(String vehicleNumber, String VehicleModel) {
        super(VehicleType.Premium, vehicleNumber, VehicleModel);
    }

    @Override
    public Long totalFarePerTrip(long kilometer) {
        return 12*kilometer;
    }
}
