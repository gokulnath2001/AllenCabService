package Factory;

import Entity.EconomyVehicle;
import Entity.LuxuryVehicle;
import Entity.PremiumVehicle;
import Entity.Vehicle;
import enums.VehicleType;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleNum, String VehicleModel, VehicleType vehicleType) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case Luxury -> vehicle = new LuxuryVehicle(vehicleNum, VehicleModel);
            case Economy ->  vehicle = new EconomyVehicle(vehicleNum, VehicleModel);
            case Premium ->   vehicle = new PremiumVehicle(vehicleNum, VehicleModel);
        }

        return vehicle;
    }
}
