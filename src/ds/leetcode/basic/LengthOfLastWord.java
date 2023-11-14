package ds.leetcode.basic;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "abc      ";

        int length = lengthOfLastWord(s);
        System.out.println(length);
    }

    private static int lengthOfLastWord(String s) {

        boolean isChecked = false;
        int count = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {

            if(s.charAt(i) == ' ' && !isChecked) {
                continue;
            } else if (s.charAt(i) == ' ' && isChecked) {
                return count;
            } else {
                count++;
            }
            isChecked = true;
        }

        return count;
    }
}
