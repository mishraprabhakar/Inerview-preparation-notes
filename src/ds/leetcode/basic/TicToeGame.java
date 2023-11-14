package ds.leetcode.basic;

public class TicToeGame {

    //Need To Revise
    public static void main(String[] args) {

        int[][] moves = {
                {0,0},
                {2,0},
                {1,1},
                {2,1},
                {2,2}
        };

        String result = tictactoe(moves);
        System.out.println("Result : "+result);

    }

    private static String tictactoe(int[][] moves) {

        int count = 0;
        char firstPlayerMove = 'X';
        char secondPlayerMove = 'O';

        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (count%2 == 0) {
                    result[i][j] = firstPlayerMove;
                    if (checkWinner(result, 'X')) {
                        return "A";
                    } else {
                        if (i == 8) {
                            return "Draw";
                        }
                    }
                } else {
                    result[i][j] = secondPlayerMove;
                    if (checkWinner(result, 'O')) {
                        return "B";
                    }
                }

            }
        }
        return "Pending";
    }

    private static boolean checkWinner(int[][] result, char value) {
        return result[0][0] == result[0][1] && result[0][1] == result[0][2] && result[0][2] == value ||
                result[1][0] == result[1][1] && result[1][1] == result[1][2] && result[1][2] == value||
                result[2][0] == result[2][1] && result[2][1] == result[2][2] && result[2][2] == value||
                result[2][0] == result[1][1] && result[1][1] == result[0][2] && result[0][2] == value||
                result[0][0] == result[1][1] && result[1][1] == result[2][2] && result[2][2] == value;
    }
}
