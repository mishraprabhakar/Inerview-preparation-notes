package ds.leetcode.basic;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        String result = longestCommonPrefixInArray(strs);
    }

    private static String longestCommonPrefixInArray(String[] strs) {

        String common = strs[0];
        int j =0;

        for (int i = 1; i < strs.length ; i++) {

            int n = Math.min(common.length(), strs[i].length());

            while (n > 0) {


            }

        }
        return "";
    }
}
