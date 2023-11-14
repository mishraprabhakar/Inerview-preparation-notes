package machine_coding.parking_lot.manager;

import machine_coding.parking_lot.model.ParkingSpot;
import machine_coding.parking_lot.model.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    private List<ParkingSpot> list;

    public ParkingSpotManager(List<ParkingSpot> list) {
        this.list = list;
    }

    public boolean findParkingSpace() {
        return list.isEmpty();
    }
    public void addParkingSpace() {

    }
    public void removeParkingSpace() {

    }
    public ParkingSpot parkVehicle(Vehicle vehicle) {

        ParkingSpot object = new ParkingSpot();
        object.parkVehicle(vehicle);
        return object;
    }
    public void unParkVehicle() {

    }


}
