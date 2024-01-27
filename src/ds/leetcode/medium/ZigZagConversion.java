package ds.leetcode.medium;

public class ZigZagConversion {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numberOfRows = 3;
        String result = convertIntoZigZag(s, numberOfRows);
        System.out.println(result);
    }

    private static String convertIntoZigZag(String s, int numberOfRows) {

        StringBuilder sb = new StringBuilder();

        if (numberOfRows == 1) {
            return s;
        }

        for (int i = 0; i < numberOfRows; i++) {

            int idx = i;
            int deltaSouth = 2 *( numberOfRows - 1 - i);
            int deltaNorth = 2 * i;
            boolean goingSouth = true;

            while (idx < s.length()) {
                sb.append(s.charAt(idx));

                if (i == 0) {
                    idx += deltaSouth;
                } else if (i == numberOfRows-1) {
                    idx += deltaNorth;
                }else {
                    if (goingSouth) {
                        idx += deltaSouth;
                    } else {
                        idx += deltaNorth;
                    }
                    goingSouth = !goingSouth;
                }
            }

        }

        return String.valueOf(sb);
    }
}
