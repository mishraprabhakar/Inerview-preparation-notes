package ds.leetcode.medium;

import machine_coding.tic_tac_toe.Main;

import java.util.Map;

public class JumpGameII {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};
        int noOfMinimumJumps = jumpGameII(nums);
        System.out.println(noOfMinimumJumps);
    }

    //Greedy Approach
    private static int jumpGameII(int[] nums) {

        int coverage = 0, jump = 0, lastIndex = 0;

        if (nums.length == 1) {
            return 0;
        }


        for (int i = 0; i < nums.length; i++) {

            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastIndex) {
                lastIndex = coverage;
                jump ++;

                if (coverage >= nums.length-1) {
                    return jump;
                }
            }


        }
        return jump;
    }
}
