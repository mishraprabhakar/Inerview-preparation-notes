package ds.leetcode.basic;

public class ToLowerCase {

    public static void main(String[] args) {

        String s = "PraBhaKar";
        String ans = lowerCase(s);
        System.out.println(ans);
    }

    private static String lowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c<='Z') {
                c = (char) ((int) c + 32);
            }
            result.append(c);
        }
        return result.toString();
    }
}
