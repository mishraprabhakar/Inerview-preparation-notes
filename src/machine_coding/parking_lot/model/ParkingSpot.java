package machine_coding.parking_lot.model;

import java.util.Random;

public class ParkingSpot {

    private final Random random = new Random();
    private Integer id;
    private Boolean isEmpty;
    private Vehicle vehicle;
    public Integer price;

    public void parkVehicle(Vehicle vehicle) {
         id = random.nextInt();
         this.vehicle = vehicle;
         isEmpty = false;
    }
    public void unParkVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Integer getPrice() {
        return price;
    }
}
