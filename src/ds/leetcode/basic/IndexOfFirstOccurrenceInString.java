package ds.leetcode.basic;

public class IndexOfFirstOccurrenceInString {

    /*Important question from interview point of view*/
    public static void main(String[] args) {

        String s1 = "adbutsa";
        String s2 = "sad";

        int i = indexInString(s1, s2);
        System.out.println(i);
    }

    private static int indexInString(String s1, String s2) {

        int length = Integer.max(s1.length(), s2.length());

        int j = 0;

        if (s1.length()>=s2.length()){
            for (int i = 0; i < length; i++) {

                if (s1.charAt(i) == s2.charAt(j)){
                    String substring = "";

                    if (length >= i + s2.length()){
                        substring = s1.substring(i, i+s2.length());
                    }

                    if (substring.equals(s2)){
                        return i;
                    }
                }
            }
        }
        return -1;

    }
}
