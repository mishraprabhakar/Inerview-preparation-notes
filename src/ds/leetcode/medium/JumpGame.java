package ds.leetcode.medium;

import java.util.Arrays;

public class JumpGame {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};
        boolean isReachingLastIndex = jumpGame(nums);
        System.out.println(isReachingLastIndex);
    }

    private static boolean jumpGame(int[] nums) {


        int finishLine = nums.length-1;

        for (int i = nums.length-2; i >= 0; i--) {

            if (i+nums[i] >= finishLine) {
                finishLine = i;
            }
        }

        return finishLine==0;
    }
}
