package ds.leetcode.basic;

public class MonotonicArray {
    public static void main(String[] args) {

        int[] nums = {9};

        boolean isMonotonic = monotonicArray(nums);
        System.out.println(isMonotonic);
    }

    private static boolean monotonicArray(int[] nums) {

        boolean isIfVisited = false;
        boolean isElseVisited = false;
        boolean isMonotonic = false;

        if (nums.length == 1) {
            isMonotonic = true;
            return isMonotonic;
        }


        for(int i =0, j= 1; j<nums.length; i++, j++) {

            if (nums[i] == nums[j]){
                isMonotonic = true;
                continue;
            }

            if (nums[i] < nums[j] && !isElseVisited){
                isIfVisited = true;
                isMonotonic = true;
            } else if (nums[i] > nums[j] && !isIfVisited){
                isElseVisited = true;
                isMonotonic = true;
            } else {
                return false;
            }

        }
        return isMonotonic;
    }
}
