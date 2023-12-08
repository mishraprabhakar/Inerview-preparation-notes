package practice;

import java.util.ArrayList;
import java.util.List;

public class DsPractice {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        List<Integer> integerList = spiralOrderOfInteger(matrix);
        System.out.println(integerList);

    }

    private static List<Integer> spiralOrderOfInteger(int[][] matrix) {

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
