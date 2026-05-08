package Entity;


import enums.VehicleType;

public class EconomyVehicle extends Vehicle {

    public EconomyVehicle(String vehicleNumber, String VehicleModel) {
        super(VehicleType.Economy, vehicleNumber, VehicleModel);
    }

    @Override
    public Long totalFarePerTrip(long kilometer) {
        return 5*kilometer;
    }



}
