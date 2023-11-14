package ds.leetcode.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] array = {
                {2}
        };

//        int[][] array = {
//                {1,2,3},
//                {2,3,4},
//                {3,4,5}
//        };

        int sum = diagonalSum(array);
        System.out.println(sum);
    }

    //One liner
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        return IntStream.range(0, n)
                .map(i -> mat[i][i] + mat[i][n-1-i])
                .sum() - (n % 2 == 1 ? mat[n/2][n/2] : 0);
    }


    //Leet-Code Approach
//    public static int diagonalSum(int[][] mat) {
//        int n = mat.length;
//        int ans = 0;
//
//        for (int i = 0; i < n; i++) {
//            // Add elements from primary diagonal.
//            ans += mat[i][i];
//            // Add elements from secondary diagonal.
//            ans += mat[n - 1 - i][i];
//        }
//        // If n is odd, subtract the middle element as its added twice.
//        if (n % 2 != 0) {
//            ans -= mat[n / 2][n / 2];
//        }
//
//        return ans;
//    }


    /*Self Approach*/

//    private static int diagonalSum(int[][] array) {
//
//        int count = 0;
//        int sum = 0;
//
//        if (array.length == 1) {
//            return array[0][0];
//        }
//
//        Map<String, Boolean> isIndexVisited = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//
//            int[] integers = array[count];
//            String key = count+","+i;
//
//            if (i == count) {
//                if (!isIndexVisited.containsKey(key)){
//                    int value = integers[i];
//                    sum = sum + value;
//                    i = count;
//                    count++;
//                    isIndexVisited.put(key, true);
//                }
//            }
//
//        }
//
//        int counter = 0;
//
//
//        for (int i = array.length-1; i >= 0 ; i--) {
//
//            if (counter == array.length) {
//                System.out.println(isIndexVisited);
//                return sum;
//            }
//            int[] ints = array[counter];
//            String key = counter+","+i;
//
//            if (i == array.length-counter-1) {
//                if (!isIndexVisited.containsKey(key)){
//                    int value = ints[i];
//                    sum = sum + value;
//                    i = array.length-counter;
//                    counter++;
//                    isIndexVisited.put(key, true);
//                } else {
//                    i = array.length-counter;
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(isIndexVisited);
//        return sum;
//    }
}
