package ds.leetcode.basic;

public class DifferenceBetweenString {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = "y";

        String difference = findDifference(s1, s2);
        System.out.println(difference);
    }

    private static String findDifference(String s1, String s2) {

        StringBuilder s = new StringBuilder();

        int length = Integer.max(s1.length(), s2.length());

        int str1Value = 0;
        int str2Value = 0;

        for (int i = 0; i < length; i++) {

            if (s1.length() > i){
                int value = s1.charAt(i);
                str1Value = str1Value + value;
            }

            if (s2.length() > i){
                int value = s2.charAt(i);
                str2Value = str2Value + value;
            }

        }
        char ans = (char) Math.abs(str1Value-str2Value);

        return String.valueOf(ans);
    }
}
