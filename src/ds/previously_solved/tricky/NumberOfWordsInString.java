package ds.previously_solved.tricky;

import java.util.Objects;

public class NumberOfWordsInString {

    public static void main(String[] args) {
        String str = "   i     I love java programming";
        int count = 0;

        String string = str.trim();

        String[] split = string.split(" ");

        for (String s : split) {
            if (!Objects.equals(s, "")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
