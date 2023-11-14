package ds.leetcode.basic;

public class CountOddNumber {
    public static void main(String[] args) {

        int low = 3, high = 11;
        int result = countOddNos(low, high);
        System.out.println(result);
        System.out.println(result==500000000);
    }

    private static int countOdds(int low, int high) {

        int count = 0;

        if (low % 2 == 0 && high % 2 == 0) {
            return high / 2;
        }

        while (low <= high) {
            if (low % 2 != 0) {
                count++;
            }
            low++;
        }
        return count;
    }

    private static int countOddNos(int low, int high) {

        int value = (high - low) / 2;

        if (low % 2 == 0 && high % 2 == 0) {
            return value;
        } else {
            return value+1;

        }
    }
}
