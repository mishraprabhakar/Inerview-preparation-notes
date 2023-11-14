package ds.leetcode.basic;

import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {

        String[] s = {"1","C","-62","-45","-68"};

        int result = calPoints(s);
        System.out.println(result);

    }

    public static int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<>();

        for (String str : operations) {

            switch (str) {

                case "C":
                    s.pop();
                    break;

                case "D":
                    Integer value = s.peek();
                    s.push(2*value);
                    break;

                case "+":
                    Integer i1 = s.elementAt(s.size()-1);
                    Integer i2 = s.elementAt(s.size()-2);
                    s.push(i1+i2);
                    break;

                default:
                    s.push(Integer.valueOf(str));
                    break;
            }
        }

        int sum = 0;

        if (s.size() == 0) {
            return 0;
        }

        for (int i : s) {
            sum += i;
        }

        return sum;
    }
}
