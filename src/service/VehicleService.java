package service;


import Entity.Vehicle;
import Factory.VehicleFactory;
import enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class VehicleService {
    private final VehicleFactory vehicleFactory;

    HashMap<String, Vehicle> vehicleNumBerToVehicle = new HashMap<>();

    public Vehicle createVehicle(String vehicleNum, String VehicleModel, VehicleType vehicleType) {

        Vehicle vehicle = vehicleFactory.createVehicle(vehicleNum, VehicleModel, vehicleType);
        System.out.println("Vehicle created: " + vehicle.toString());
        vehicleNumBerToVehicle.put(vehicle.getVehicleNumber(), vehicle);
        return vehicle;
    }


    public Vehicle getVehicle(String vehicleNumber) {
        System.out.println("getVehicle: " + vehicleNumBerToVehicle.get(vehicleNumber));
        return vehicleNumBerToVehicle.get(vehicleNumber);
    }
}
