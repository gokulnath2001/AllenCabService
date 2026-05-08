package service;

import java.util.HashMap;
import java.util.Map;

public class DriverFareService {

    private Map<String, Long> driverToFareMap = new HashMap<>();

    public Long addDriverfare(String driverName, Long fare) {
        System.out.println("Driver Fare Adding " + driverName + "driver fare" + fare);
        driverToFareMap.put(driverName, driverToFareMap.getOrDefault(driverName, 0L) + fare);
        return driverToFareMap.get(driverName);
    }

    public Long getDriverFare(String driverName) {
        return driverToFareMap.getOrDefault(driverName, null);
    }

}
