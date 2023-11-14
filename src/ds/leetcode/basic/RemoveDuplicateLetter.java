package ds.leetcode.basic;

import java.util.*;

public class RemoveDuplicateLetter {

    public static void main(String[] args) {

        String s = "cbacdcbc";

        String value = removeDuplicateLetter(s);
        System.out.println(value);

    }

    private static String removeDuplicateLetter(String s) {

        Map<Character, Integer> map = new HashMap<>();

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (map.containsKey(c)){
                continue;
            }else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            ans.append(c);
        }
        String lexicographicallySmallest = findLexicographicallySmallest(ans.toString());
        return lexicographicallySmallest;

    }
    public static String findLexicographicallySmallest(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(str, 0, str.length() - 1, permutations);
        Collections.sort(permutations);
        if (permutations.isEmpty()) {
            return ""; // Return an empty string if there are no permutations.
        }
        return permutations.get(0);
    }

    private static void generatePermutations(String str, int left, int right, List<String> permutations) {
        if (left == right) {
            permutations.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                generatePermutations(str, left + 1, right, permutations);
                str = swap(str, left, i); // Backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
