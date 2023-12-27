package ds.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    public static void main(String[] args) {

        String s = "226";
//        int i = numDecoding(s);
//        System.out.println(i);
    }

    private static int numDecoding(String s) {

        int count = 1;
        int start = 65;
        int end = 90;

        Map<Integer, Character> map = new HashMap<>();

        for (int i = start; i <= end; i++) {
            char alphabet = (char) i;
            map.put(count, alphabet);
            count++;
        }
        return 0;
    }

    private static boolean isEquals(String s, Map<Integer, Character> map, String value) {

        // 226 --> 2, 2, 6, 22, 6, 2, 26, 226
        boolean isContains = false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){

            }
        }

        return isContains;
    }

}
