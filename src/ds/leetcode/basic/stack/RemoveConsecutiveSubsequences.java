package ds.leetcode.basic.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    // 1 2 2 3 10 10 10 4 4 4 5 7 7 2
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 10, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2, 2, 2, 2, 2, 3, 3};

        int[] result = consecutiveSubsequences(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] consecutiveSubsequences(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int i;

        for ( i = 0; i < arr.length-1; i++) {

            if (!st.isEmpty() && arr[i] == st.peek()) {
                if(arr[i] == arr[i+1]) {
                    //do nothing
                } else if (arr[i] == st.peek() && arr[i] != arr[i+1]) {
                    st.pop();
                }
            } else {
                st.push(arr[i]);
            }

        }

        while (i < arr.length) {
            if (arr[i] == st.peek()) {
                st.pop();
            } else {
                st.push(arr[i]);
            }
            i++;
        }


        int[] result = new int[st.size()];
        int j = 0;
        for (int k : st) {
            result[j] = k;
            j++;
        }

        return result;
    }
}
