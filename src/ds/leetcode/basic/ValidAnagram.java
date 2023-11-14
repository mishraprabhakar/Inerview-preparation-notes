package ds.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s1 = "car";
        String s2 = "rat";

        boolean b = validAnagram(s1, s2);
        System.out.println(b);
    }

    private static boolean validAnagram(String s1, String s2) {

        if (s1.length() != s2.length()){
            return false;
        }

        Map<Character, Integer> str1Values = returnKeysAndValuesOfString(s1);
        Map<Character, Integer> str2Values = returnKeysAndValuesOfString(s2);

        System.out.println(str1Values);
        System.out.println(str2Values);

        if (str1Values.equals(str2Values)){
            return true;
        }

        return false;
    }

    private static Map<Character, Integer> returnKeysAndValuesOfString(String str) {

        Map<Character, Integer> values = new HashMap<>();

        for (Character c: str.toCharArray()) {

            if (values.containsKey(c)) {
                values.put(c, values.get(c) + 1);
            } else {
                values.put(c, 1);
            }
        }
        return values;
    }
}
