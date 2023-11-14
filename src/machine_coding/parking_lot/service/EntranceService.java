package machine_coding.parking_lot.service;

import machine_coding.parking_lot.constant.VehicleType;
import machine_coding.parking_lot.factory.ParkingManagerFactory;
import machine_coding.parking_lot.manager.ParkingSpotManager;
import machine_coding.parking_lot.model.ParkingSpot;
import machine_coding.parking_lot.model.Ticket;
import machine_coding.parking_lot.model.Vehicle;

import java.time.LocalDateTime;

public class EntranceService {
    private final ParkingManagerFactory parkingManagerFactory;

    public EntranceService(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public boolean findSpace(VehicleType type) {

        ParkingSpotManager parkingSpotManager =
                parkingManagerFactory.getParkingSpotManager(type);

        return parkingSpotManager
                .findParkingSpace();

    }

    public ParkingSpot bookParkingSpot(Vehicle vehicle) {

        ParkingSpotManager parkingSpotManager = parkingManagerFactory
                .getParkingSpotManager(vehicle.getVehicleType());

        return parkingSpotManager.parkVehicle(vehicle);

    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot) {
        return new Ticket(LocalDateTime.now(), vehicle, spot);
    }

}
