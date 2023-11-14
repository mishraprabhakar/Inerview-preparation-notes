package ds.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4,5},
                {14,15,16,17,6},
                {13,0,19,18,7},
                {12,11,0,9,8}
        };

        int[][] result = setZero(matrix);

        for (int[] ints: result) {
            for (int i : ints) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[][] setZero(int[][] matrix) {

        int colLeft = 0, colRight = matrix[0].length;

        List<Integer> columnList = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();

        int row = 0;

        while (colLeft < colRight) {

            if (matrix[row][colLeft] == 0) {
                rowList.add(row);
                columnList.add(colLeft);
            }
            colLeft++;

            if (colLeft == colRight && row < matrix.length - 1) {
                row = row + 1;
                colLeft = 0;
            }
        }

        return replaceRowAndColWithZero(matrix, rowList, columnList);
    }

    private static int[][] replaceRowAndColWithZero(int[][] matrix, List<Integer> row, List<Integer> col) {

        for (int i : row) {
            int colSize = matrix[0].length;
            int count = 0;
            while (count < colSize) {
                matrix[i][count] = 0;
                count++;
            }
        }

        for (int i : col) {
            int rowSize = matrix.length;
            int count = 0;
            while (count < rowSize) {
                matrix[count][i] = 0;
                count++;
            }
        }

        return matrix;
    }

}
