package machine_coding.parking_lot.manager.extentions;

import machine_coding.parking_lot.manager.ParkingSpotManager;

import java.util.ArrayList;

public class FourWheelerManager extends ParkingSpotManager {
    public FourWheelerManager() {
        super(new ArrayList<>(400));
    }
}
