package ds.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {

        int[] array = {1,1,1,2,2,3};
        int[] arr = {2,2,1,1,1,2,2};

        int result = removeDuplicatesFromArrayII(array);
        int i = majorityElements(arr);

        System.out.println(i);
    }

    private static int removeDuplicatesFromArrayII(int[] array) {

        int result = 1;
        int count = 0;
        int j  = 1;

        int len = array.length;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i-1]) {
                count = count + 1;
            } else {
                count = 0;
            }

            if (count < 2){
                array[j] = array[i];
                result += 1;
                j++;
            }
        }
        return result;
    }

    private static int majorityElements(int[] nums) {

        Map<Integer, Integer> value = new HashMap<>();

        int max = 0;
        int result = 0;

        for (int i : nums) {
            if (value.containsKey(i)) {
                value.put(i, value.get(i)+1);
            } else {
                value.put(i, 1);
            }
        }

        for (var m : value.entrySet()) {
            if (max < m.getValue()) {
                max = m.getValue();
                result = m.getKey();
            }
        }
        return result;
    }
}
