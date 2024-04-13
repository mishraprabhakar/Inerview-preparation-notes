package ds.leetcode.basic.basic_programming_warm_up;

import java.util.Stack;

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 *You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 */
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

        if (s.isEmpty()) {
            return 0;
        }

        for (int i : s) {
            sum += i;
        }

        return sum;
    }
}
