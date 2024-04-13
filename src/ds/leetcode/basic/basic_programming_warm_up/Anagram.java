package ds.leetcode.basic.basic_programming_warm_up;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        anagram(arr);
    }

    private static void anagram(String[] arr) {

        Map<String, String> map = new HashMap<>();

        for (String s : arr) {
            String temp = s;
            String sort = sortString(temp);
            if (map.containsKey(sort)) {
                map.put(sort, map.get(sort) + ", "+s);
            } else {
                map.put(sort, s);
            }
        }

        for (String value : map.values()) {
            System.out.print(value+" ");
        }
    }

    private static String sortString(String temp) {

        char[] string = temp.toCharArray();

        Arrays.sort(string);
        StringBuilder sb = new StringBuilder();

        for (char c : string) {
            sb.append(c);
        }

        return String.valueOf(sb);
    }
}
