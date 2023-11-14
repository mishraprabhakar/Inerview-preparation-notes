package machine_coding.parking_lot.strategy;

import machine_coding.parking_lot.model.ParkingSpot;

public interface PricingStrategy {

    default Integer returnPrice() {
        return new ParkingSpot().getPrice();
    }
}
