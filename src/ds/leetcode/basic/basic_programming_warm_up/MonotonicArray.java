package ds.leetcode.basic.basic_programming_warm_up;

/**
 * Firstly iterate through the nums while elements are equal.
 * If they are not equal then check whether the immediate not equal elements are increasing or decreasing.
 * if they are increasing mark the flag false.
 * If they are decreasing mark the flag true.
 * Then iterate the nums from where first not equal elements encounter and check
 * whether they follow the same increasing or decreasing pattern.
 * if not then return false. If yes and we have reached the end of nums then return true.
 */
public class MonotonicArray {
    public static void main(String[] args) {

        int[] nums = {9,8,7,6,5,4,10,2};

        boolean isMonotonic = monotonicArray(nums);
        System.out.println(isMonotonic);
    }

    private static boolean monotonicArray(int[] nums) {

        int n = nums.length;

        if (n <= 2) {
            return true;
        }

        int index = 1;

        while (index < n && nums[index] == nums[index+1] ) {
            index++;
        }

        boolean flag = false;

        if(index < n && nums[index] < nums[index-1]) {
            flag = true;
        }

        for (int i = index; i<n; i++) {

            if (flag == true && nums[i] > nums[i-1]) {
                return false;
            } else if (flag == false && nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
