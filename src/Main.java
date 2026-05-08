import Entity.Driver;
import Entity.Vehicle;
import Factory.FareServiceFactory;
import Factory.TripFactory;
import Factory.VehicleFactory;
import enums.TripStatus;
import enums.TripType;
import enums.VehicleType;
import service.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    VehicleService vehicleService = new VehicleService(new VehicleFactory());
    DriverService driverService = new DriverService();
    DriverFareService driverFareService = new DriverFareService();
    DriverToVehicleMappingService  driverToVehicleMappingService = new DriverToVehicleMappingService();
    TripService tripService = new TripService(driverService,
            driverToVehicleMappingService,
            new TripFactory(),
            new FareServiceFactory(),
            driverFareService);

    driverService.addDriver(new Driver("DL_01", "Sachin", "123"));
    driverService.addDriver(new Driver("DL_02", "Ramesh", "123"));
    driverService.addDriver(new Driver("DL_03", "Manjunath", "123"));

    vehicleService.createVehicle("KA-01-2222", "Maruthi", VehicleType.Economy );
    vehicleService.createVehicle("KA-01-2223", "Eritga", VehicleType.Premium );
    vehicleService.createVehicle("KA-01-2224", "BMW", VehicleType.Luxury );


    driverToVehicleMappingService.updateVehicleForDriver(driverService.getDriver("Ramesh"), vehicleService.getVehicle("KA-01-2222"));
    driverToVehicleMappingService.updateVehicleForDriver(driverService.getDriver("Manjunath"), vehicleService.getVehicle("KA-01-2223"));


    tripService.addTripToDriver(50,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.INTRACITY,
            TripStatus.COMPLETED,
            "Ramesh");

    tripService.addTripToDriver(1050,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.OUTSTATION,
            TripStatus.COMPLETED,
            "Ramesh");

    tripService.addTripToDriver(50,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.INTRACITY,
            TripStatus.CANCELLED_CUSTOMER,
            "Ramesh");

    tripService.addTripToDriver(50,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.OUTSTATION,
            TripStatus.CANCELED_DRIVER,
            "Manjunath");

    tripService.addTripToDriver(70,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.OUTSTATION,
            TripStatus.COMPLETED,
            "Manjunath");

    System.out.println("Driver Fare RAMESH" + driverFareService.getDriverFare("Ramesh"));
    System.out.println("Driver Fare Manjunath" + driverFareService.getDriverFare("Manjunath"));



    driverToVehicleMappingService.updateVehicleForDriver(driverService.getDriver("Manjunath"), vehicleService.getVehicle("KA-01-2224"));

    tripService.addTripToDriver(1,
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            LocalDateTime.ofEpochSecond(1723116023, 0, ZoneOffset.UTC),
            TripType.INTRACITY,
            TripStatus.COMPLETED,
            "Manjunath");

    System.out.println("Driver Fare Manjunath" + driverFareService.getDriverFare("Manjunath"));




}
