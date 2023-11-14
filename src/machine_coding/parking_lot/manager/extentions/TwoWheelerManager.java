package machine_coding.parking_lot.manager.extentions;

import machine_coding.parking_lot.manager.ParkingSpotManager;

import java.util.ArrayList;

public class TwoWheelerManager extends ParkingSpotManager {

    public TwoWheelerManager() {
        super(new ArrayList<>(600));
    }


}
