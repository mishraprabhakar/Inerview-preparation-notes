package ds.leetcode.medium;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {

        String s  = "  hello world  ";
        String result = reverseString(s);
        System.out.println(result);
    }

    private static String reverseString(String s) {

        String string = s.trim();
        String result = "";

        StringBuilder sb = new StringBuilder();

        String[] str = s.split(" ");

        for (int i = str.length-1; i >=0 ; i--) {
            if (str[i] != "") {
                sb.append(str[i]);
                sb.append(" ");
            }
        }

        if (sb.length() > 1) {
            String value = String.valueOf(sb);
            result = value.substring(0, value.length()-1);
        } else {
            return s;
        }

        return result;
    }
}
