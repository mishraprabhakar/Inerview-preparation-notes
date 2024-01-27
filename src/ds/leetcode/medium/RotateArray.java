package ds.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;

public class RotateArray {
    public static void main(String[] args) {

        int[] array = {-1,-100,3,99};
        rotateArray(array, 2);
        System.out.println(Arrays.toString(array));
    }

    private static void rotateArray(int[] array, int k) {

        if (k > array.length) {
            k = k % array.length;
        }

        int n = array.length - 1;

        reverseArray(array, 0, array.length - 1);
        reverseArray(array, 0, k-1);
        reverseArray(array, k, n );

    }

    public static void reverseArray(int[] array, int a, int b) {

        int i = a, j = b;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
