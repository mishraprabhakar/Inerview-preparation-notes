package machine_coding.parking_lot.factory;

import machine_coding.parking_lot.constant.VehicleType;
import machine_coding.parking_lot.manager.ParkingSpotManager;
import machine_coding.parking_lot.manager.extentions.FourWheelerManager;
import machine_coding.parking_lot.manager.extentions.TwoWheelerManager;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType type) {

        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerManager();
            case FOUR_WHEELER -> new FourWheelerManager();
        };
    }
}
