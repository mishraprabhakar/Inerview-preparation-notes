package ds.leetcode.basic.two_pointers;

import java.util.Arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int area = maxArea(height);
        System.out.println(area);
    }

    private static int maxArea(int[] height) {

        int difference = 0;
        int result = 0;

        int[] sortedArray = new int[height.length];

        int i = 0, j = height.length-1;

        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            }
        }
        return result;
    }
}
