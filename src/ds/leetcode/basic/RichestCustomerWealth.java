package ds.leetcode.basic;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    private static int maximumWealth(int[][] accounts) {

//        int maxValue = 0;
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 0; i < accounts[count].length; i++) {
//
//            if (i == accounts[count].length-1) {
//
//                int value = accounts[count][accounts[count].length - 1];
//                if (maxValue < sum + value) {
//                    maxValue = sum + value;
//                }
//                if (count == accounts.length-1){
//                    break;
//                }
//                count++;
//                sum = 0;
//                i = -1;
//            }
//            else {
//                sum += accounts[count][i];
//            }
//
//        }
        return  Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum()) // Calculate sum of each account
                .max() // Find the maximum wealth
                .orElse(0);
//        return maxValue;

    }
}
