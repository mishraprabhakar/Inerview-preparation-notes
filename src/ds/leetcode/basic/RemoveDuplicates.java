package ds.leetcode.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(array);
        System.out.println(i);

    }

    private static int removeDuplicates(int[] array) {

        int temp = Integer.MIN_VALUE, j = 0;

        for (int i = 0; i < array.length; i++) {

            if (temp != array[i]) {
                array[j] = array[i];
                temp = array[i];
                j++;
            }
        }
        return j;
    }
}
