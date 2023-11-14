package ds.leetcode.basic;

public class LemonadeChange {

    public static void main(String[] args) {

        int[] bills = {10,10};

        boolean result = lemonadeChange(bills);
        System.out.println(result);
    }

    private static boolean lemonadeChange(int[] bills) {

        int five = 0, ten = 0, twenty = 0;

        for (int i : bills) {

            if (i == 5) {
                five++;

            } else if (i == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }

            } else {

                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five = five - 3;
                } else {
                    return false;
                }
                twenty++;
            }
        }
        return true;
    }
}
