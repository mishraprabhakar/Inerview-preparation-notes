package ds.leetcode.basic;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }

    private static int numIdenticalPairs(int[] nums) {

        int count = 0;
        int inc = 0;

        for (int i = 1; i < nums.length; i++) {
            if ( nums[inc] == nums[i]) {
                count++;
            }
            if (i == nums.length-1) {
                inc += 1;
                i = inc;
            }
        }
        return count;
    }
}
