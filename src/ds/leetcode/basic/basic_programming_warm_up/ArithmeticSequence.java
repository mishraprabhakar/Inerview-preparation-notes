package ds.leetcode.basic.basic_programming_warm_up;

import java.util.Arrays;

public class ArithmeticSequence {

    public static void main(String[] args) {

        int[] arr = {3,5,1};
        boolean isArithmeticSequence = arithmeticSequence(arr);
        System.out.println(isArithmeticSequence);
    }

    private static boolean arithmeticSequence(int[] arr) {

        Arrays.sort(arr);

        int value = arr[0] - arr[1];

        for (int i = 0, j =1; j < arr.length; i++, j++) {

            if (arr[i] - arr[j] != value) {
                return false;
            }
        }

        return true;
    }
}
