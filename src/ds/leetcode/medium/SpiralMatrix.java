package ds.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4,5},
                {14,15,16,17,6},
                {13,20,19,18,7},
                {12,11,10,9,8}
        };

        List<Integer> integerList = spiralOrder(matrix);
        System.out.println(integerList);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int row = matrix.length, column = matrix[0].length;
        int top = 0, bottom = row -1, left = 0, right = column -1;
        int count = row * column;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                if (count == 0) {
                    return result;
                }
                count--;
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                if (count == 0) {
                    return result;
                }
                count--;
                result.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left; i--) {
                if (count == 0) {
                    return result;
                }
                count--;
                result.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                if (count == 0) {
                    return result;
                }
                count--;
                result.add(matrix[i][left]);
            }
            left++;

        }
        return result;
    }
}
