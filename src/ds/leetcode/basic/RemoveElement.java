package ds.leetcode.basic;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    private static int removeElement(int[] nums, int val) {

        int count = 0, j= 0;
        for (int i : nums) {
            if (i != val) {
                count++;
                nums[j] = i;
            }
        }
        return count;
    }
}
