package ds.leetcode.basic.two_pointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};

        int[] result = twoSumOfNumber(numbers, 9);
        Arrays.toString(result);
    }

    private static int[] twoSumOfNumber(int[] numbers, int target) {

        int[] result = new int[2];

        int i = 0, j = numbers.length-1;

        while (i < j) {

            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
        return result;
    }
}
