package ds.leetcode.basic;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pq";

        String s = mergeStringAlternately(s1, s2);
        System.out.println(s);
    }

    private static String mergeStringAlternately(String s1, String s2) {

        StringBuilder s = new StringBuilder();

        int length = Integer.max(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {

            if (s1.length() > i){
                s.append(s1.charAt(i));
            }
            if (s2.length() > i){
                s.append(s2.charAt(i));
            }

        }
        String ans = String.valueOf(s);
        return ans;
    }
}
