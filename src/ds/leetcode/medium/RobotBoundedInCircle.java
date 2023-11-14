package ds.leetcode.medium;

public class RobotBoundedInCircle {
    public static void main(String[] args) {
        String value = "GGLLGR";

        boolean result = isRobotBounded(value);
        System.out.println(result);
    }

    private static boolean isRobotBounded(String s) {

        int x = 0;
        int y = 0;

        String direction = "North";

        for (char c : s.toCharArray()) {

            if (c == 'G') {
                if (direction.equals("North"))
                    y += 1;
                else if (direction.equals("South"))
                    y -= 1;
                else if(direction.equals("East"))
                    x += 1;
                else
                    x -= 1;
            } else if (c == 'L') {
                if (direction.equals("North")) {
                    direction = "West";
                } else if (direction.equals("West")) {
                    direction = "South";
                } else if (direction.equals("South")) {
                    direction = "East";
                } else {
                    direction = "North";
                }

            }
            else if (c == 'R') {
                if (direction.equals("North")) {
                    direction = "East";
                } else if (direction.equals("East")) {
                    direction = "South";
                } else if (direction.equals("South")) {
                    direction = "West";
                } else {
                    direction = "North";
                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }

        if (direction.equals("North")) {
            return false;
        }

        return true;
    }
}
