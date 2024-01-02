package ds.leetcode.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] array = {-1,-100,3,99};
        rotateArray(array, 2);
    }

    private static void rotateArray(int[] array, int k) {

        for (int i = 0; i < k; i++) {
            rotateA(array);
        }
    }

    private static void rotateA(int[] array) {

        int j = array[array.length-1];
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                temp = array[i];
                array[i] = j;
            } else {
                int value = array[i];
                array[i] = temp;
                temp = value;
            }
        }
    }
}
