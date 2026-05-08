package Factory;

import Entity.Trip;
import service.CancelledTripFareCalculatorService;
import service.CompletedTripFareCalculatorService;
import service.FareCalculatorService;

public class FareServiceFactory {

    public FareCalculatorService getFareCalculatorService(Trip trip) {

        FareCalculatorService fareCalculatorService = null;
        switch (trip.getTripStatus()) {
            case COMPLETED -> fareCalculatorService = new CompletedTripFareCalculatorService();
            case CANCELED_DRIVER, CANCELLED_CUSTOMER ->  fareCalculatorService = new CancelledTripFareCalculatorService();
        }

        return fareCalculatorService;
    }
}
