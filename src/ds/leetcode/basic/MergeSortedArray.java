package ds.leetcode.basic;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        int m = 3;
        int n = 3;

        mergeTwoSortedArray(num1, m , num2 ,n);
    }

    private static void mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
