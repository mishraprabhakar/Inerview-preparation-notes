package ds.leetcode.basic.basic_programming_warm_up;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "L";

        boolean isReturnedToOrigin = findIfRobotReturnToOrigin(moves);
        System.out.println(isReturnedToOrigin);
    }

    private static boolean findIfRobotReturnToOrigin(String moves) {

        int a = 0, c = 0;

        for (int i = 0; i < moves.length(); i++) {

            switch (moves.charAt(i)) {
                case 'L':
                    c++;
                    break;
                case 'R':
                    c--;
                    break;
                case 'U':
                    a++;
                    break;
                default:
                    a--;
                    break;
            }
        }
        return a == 0 && c == 0;
    }
    
    

    /*private static boolean findifRobotReturnToOrigin(String moves) {

        Map<Character, Integer> movesValue = new HashMap<>();

        for (char c : moves.toCharArray()) {

            if (!movesValue.containsKey(c)) {
                movesValue.put(c, 1);
            } else {
                movesValue.put(c, movesValue.get(c)+1);
            }
        }

        int valueOfR = 0;
        if (movesValue.containsKey('R')) {
            valueOfR = movesValue.get('R');
        }
        int valueOfD = 0;
        if (movesValue.containsKey('D')) {
            valueOfD = movesValue.get('D');
        }
        int valueOfL = 0;
        if (movesValue.containsKey('L')) {
            valueOfL = movesValue.get('L');
        }
        int valueOfU = 0;
        if (movesValue.containsKey('U')) {
            valueOfU = movesValue.get('U');
        }

        return valueOfL == valueOfR && valueOfU == valueOfD;

    }*/
}
