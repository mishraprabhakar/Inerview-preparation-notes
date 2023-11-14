package ds.leetcode.basic;

import java.util.Arrays;

public class AverageSalaryExcludingMinAndMaxSal {

    public static void main(String[] args) {

        int[] sal = { 1000,2000,3000 };

        double avg = average(sal);
        System.out.println(avg);
    }

    private static double average(int[] sal) {

        Arrays.sort(sal);
        int sum = 0;
        int count = 0;

        for (int i = 1; i < sal.length-1; i++) {
            sum += sal[i];
            count++;
        }

        return (double)sum/count;
    }
}
