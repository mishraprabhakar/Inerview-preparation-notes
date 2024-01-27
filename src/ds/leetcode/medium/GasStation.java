package ds.leetcode.medium;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args) {

        int[] gas = {1,2,3,4,5};
        int[] distance = {3,4,5,1,2};

        int indexStartPoint = canCompleteCircuit(gas, distance);
        System.out.println(indexStartPoint);
    }

    private static int canCompleteCircuit(int[] gas, int[] distance) {

        int fuel = 0, totalDif = 0, index = 0;

        for (int i = 0; i < gas.length; i++) {

            int diff = gas[i] - distance[i];
            totalDif += diff;
            fuel += diff;

            if (fuel < 0) {
                index = i+1;
                fuel = 0;
            }

        }

        return totalDif < 0 ? -1 : index;

    }
}
