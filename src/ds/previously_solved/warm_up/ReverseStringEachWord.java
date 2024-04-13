package ds.previously_solved.warm_up;

import java.util.Arrays;

public class ReverseStringEachWord {
    public static void main(String[] args) {

        String str = "I love Java Language";
        StringBuilder result = new StringBuilder();

        String[] strings = str.split(" ");

        System.out.println(Arrays.toString(strings));

        for (String s : strings) {
            StringBuilder sb = new StringBuilder(s);

            if (!s.isEmpty()) {
                result.append(sb.reverse());
                result.append(" ");

            }
        }

        String s = String.valueOf(result);
        System.out.println(s);

    }
}
