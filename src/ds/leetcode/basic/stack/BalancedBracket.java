package ds.leetcode.basic.stack;

import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {

        String brackets = ")(((())()))(";

        boolean b = balanceBracket(brackets);
        System.out.println(b);
    }

    private static boolean balanceBracket(String brackets) {

        int n = brackets.length();
        Stack<Character> stack = new Stack<>();

        if (n %2 != 0) {
            return false;
        }

        for (int i = 0; i < n; i++) {

            if (brackets.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) return false;
                 else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }

        }

        if (stack.isEmpty()) {
            return true;

        }
        return false;
    }
}
