package Entity;

import enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public abstract class Vehicle {

    VehicleType vehicleType;
    String vehicleNumber;
    String VehicleModel;

    public Vehicle(VehicleType vehicleType, String vehicleNumber, String vehicleModel) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.VehicleModel = vehicleModel;
    }

    public abstract Long totalFarePerTrip(long kilometer);

}
