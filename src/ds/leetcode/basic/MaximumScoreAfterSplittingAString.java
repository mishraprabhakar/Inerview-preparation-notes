package ds.leetcode.basic;

public class MaximumScoreAfterSplittingAString {

    public static void main(String[] args) {

        String s = "011101";
        int result = returnMaximumValue(s);
        System.out.println(result);

    }

    private static int returnMaximumValue(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            int count0 = 0;
            int count1 = 0;

            String s1 = s.substring(0, i);
            int length = s1.length();
            if (length >= 1) {
                 count0 = containValue(s1, '0', length);
            } else {
                continue;
            }

            String s2 = s.substring(i);
            int len = s2.length();
            count1 = containValue(s2, '1', len);

            int add = count1 + count0;
            if (sum < add) {
                sum = add;
            }
        }
        return sum;
    }

    private static int containValue(String s, char value, int len) {

        int count = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < len; i++) {

            if (s.contains(String.valueOf(value))) {
                count++;
                StringBuilder newString = sb.deleteCharAt(s.indexOf(value));
                s = String.valueOf(newString);
            }
        }
        return count;
    }
}
