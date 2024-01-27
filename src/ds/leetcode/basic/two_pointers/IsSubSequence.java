package ds.leetcode.basic.two_pointers;

public class IsSubSequence {
    public static void main(String[] args) {

        String s = "abc";
        String s1 = "ahbgd";

        boolean result = isSubSequence(s,s1);
        System.out.println(result);
    }

    private static boolean isSubSequence(String s, String s1) {

        boolean[] result = new boolean[s.length()];
        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (s1.contains(String.valueOf(c))) {
                int index = s1.indexOf(c);
                s1 = s1.substring(index+1);
                result[j] = true;
                j++;
            }
            else {
                result[j] = false;
                j++;
            }
        }

        for (boolean b : result) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
