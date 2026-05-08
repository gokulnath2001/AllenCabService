package service;

import Entity.Driver;

import java.util.HashMap;
import java.util.Map;

public class DriverService {

    Map<String, Driver> drivers = new HashMap<>();

    public Driver addDriver(Driver driver) {
        drivers.put(driver.getName(),  driver);
        return driver;
    }

    public Driver getDriver(String driverName) {
        return drivers.getOrDefault(driverName, null);
    }
}
