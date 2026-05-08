package service;

import Entity.Driver;
import Entity.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class DriverToVehicleMappingService {

    HashMap<String, Vehicle> driverIdToVehicleHashMap = new HashMap<>();

    public Vehicle getVehicleForDriver(Driver driver) {
        return driverIdToVehicleHashMap.getOrDefault(driver.getId(), null);
    }

    public Vehicle updateVehicleForDriver(Driver driver, Vehicle vehicle) {
        System.out.println("VehicleNumber:" + vehicle.getVehicleNumber());
        driverIdToVehicleHashMap.put(driver.getId(), vehicle);
        System.out.println("driverIdToVehicleHashMap: " + driverIdToVehicleHashMap);
        return vehicle;
    }


}
