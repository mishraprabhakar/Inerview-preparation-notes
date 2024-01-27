package ds.leetcode.basic.two_pointers;

public class IsPalindrome {

    public static void main(String[] args) {

        String s = "0P";
        boolean isPal = isPalindromeString(s);
        System.out.println(isPal);
    }

    private static boolean isPalindromeString(String s) {

        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase);

        StringBuilder sb = new StringBuilder();
        StringBuilder reverseString = new StringBuilder();

        for (char c : lowerCase.toCharArray()) {

            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                sb.append(c);
                reverseString.append(c);
            }
        }

        StringBuilder reverse = reverseString.reverse();

        if (sb.compareTo(reverse) == 0) {
            return true;
        }
        return false;
    }
}
