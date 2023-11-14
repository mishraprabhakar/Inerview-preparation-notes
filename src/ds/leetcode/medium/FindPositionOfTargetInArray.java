package ds.leetcode.medium;

public class FindPositionOfTargetInArray {

    public static void main(String[] args) {

        int[] array = {5,7,7,8,8,8};
        int target = 8;

        int[] result = searchRange(array, target);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }

    private static int[] searchRange(int[] array, int target) {

        int start = -1, end = -1;

        for (int i = 0; i < array.length; i++) {

            
        }

        return new int[]{start, end};
    }
}
