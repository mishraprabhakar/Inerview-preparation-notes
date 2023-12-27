package ds.leetcode.basic;

public class MinimumChangesToMakeAlternateBinaryString {

    public static void main(String[] args) {

        String s = "10010100";
        int result = returnMinimumValueToMakeAlternateBinaryString(s);
        System.out.println(result);
    }

    private static int returnMinimumValueToMakeAlternateBinaryString(String s) {

        return returnCount(s, s.charAt(0));

    }

    private static int returnCount(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(0) == c) {
                if (i%2 == 0) {
                    if (s.charAt(i) != c) {
                        count++;
                    }
                } else {
                    if (s.charAt(i) == c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
