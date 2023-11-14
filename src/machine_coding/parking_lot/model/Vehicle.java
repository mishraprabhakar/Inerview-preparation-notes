package machine_coding.parking_lot.model;

import machine_coding.parking_lot.constant.VehicleType;

public class Vehicle {

    private Integer vehicleNumber;
    private VehicleType vehicleType;

    public Integer getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
