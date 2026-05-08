package service;

import Entity.Driver;
import Entity.Trip;
import Entity.Vehicle;
import Factory.FareServiceFactory;
import Factory.TripFactory;
import enums.TripStatus;
import enums.TripType;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class TripService {

    private final DriverService driverService;
    private final DriverToVehicleMappingService driverToVehicleMappingService;
    private final TripFactory tripFactory;
    private final FareServiceFactory fareServiceFactory;
    private final DriverFareService driverFareService;

    public Long addTripToDriver(long kilometers,
                        LocalDateTime tripStartTime,
                        LocalDateTime tripEndTime,
                        TripType tripType,
                        TripStatus tripStatus,
                        String driverName) {



        if(driverService.getDriver(driverName) == null) {
            System.out.println("Driver " + driverName + " not found");
            return null;
        }

        Driver driver = driverService.getDriver(driverName);
        if(driverToVehicleMappingService.getVehicleForDriver(driver) == null) {
            System.out.println("No Vehicle found for driver: " + driverName);
            return null;
        }
        Vehicle vehicle = driverToVehicleMappingService.getVehicleForDriver(driver);

        Trip newTrip = tripFactory.getTrip(tripType, vehicle, kilometers, tripStatus, tripStartTime, tripEndTime);

        service.FareCalculatorService fareCalculatorService = fareServiceFactory.getFareCalculatorService(newTrip);
        long fareForTrip = fareCalculatorService.calculateFare(newTrip);
        driverFareService.addDriverfare(driverName, fareForTrip);
        return fareForTrip;
    }

}
