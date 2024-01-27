package ds.leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] result = productOfNums(nums);

        Arrays.stream(result)
                .forEach(System.out::println);

    }

    private static int[] productOfNums(int[] nums) {

        int[] leftPortion = new int[nums.length];
        int[] rightPortion = new int[nums.length];

        int[] ans = new int[nums.length];

        leftPortion[0] = 1;
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            leftPortion[i] = leftPortion[j]*nums[j];
            j++;
        }

        rightPortion[nums.length - 1] = 1;
        int k = nums.length-1;

        for (int i = nums.length-2; i >= 0; i--) {
            rightPortion[i] = rightPortion[k] * nums[k];
            k--;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = leftPortion[i] * rightPortion[i];
        }

        return ans;
    }
}
