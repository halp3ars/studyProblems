import java.util.NavigableSet;
import java.util.TreeSet;

public class Problem1 {

    public static boolean isValid(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) // check columns
            {
                if (board[i][j] == '.') {
                    continue;
                } else if (board[i][j] == '1' | board[i][j] == '2' | board[i][j] == '3' | board[i][j] == '4' | board[i][j] == '5' | board[i][j] == '6' | board[i][j] == '7' | board[i][j] == '8' | board[i][j] == '9') {
                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[i][j] == board[i][k]) {
                            System.out.println("Matrix contains not valid value");
                            return false;
                        }
                    }
                } else {
                    System.out.println("Matrix contains not valid value");
                    return false;
                }

            }
            for (int p = 0; p < board.length; p++) // Check rows
            {
                if (board[p][i] == '.') {
                    continue;
                } else if (board[p][i] == '1' | board[p][i] == '2' | board[p][i] == '3' | board[p][i] == '4' | board[p][i] == '5' | board[p][i] == '6' | board[p][i] == '7' | board[p][i] == '8' | board[p][i] == '9') {
                    for (int k = p + 1; k < board[p].length; k++)
                        if (board[p][i] == board[k][i]) {
                            System.out.println("Matrix contains not valid value");
                            return false;

                        }

                } else {
                    System.out.println("Matrix contains not valid value");
                    return false;
                }

            }
        }
        System.out.println("Matrix is valid");
        return true;
    }

  /*  public static boolean IsValidNavigableSetRow(char[][] board) {


        NavigableSet<Character> navSetRows = new TreeSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else if (board[i][j] >= '1' && board[i][j] <= 9) {
                    navSetRows.add(board[i][j]);

                }
                navSetRows.clear();
            }
        }
        return true;
    }*/




    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 = {
                {'6', '5', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '3', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '3', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValid(board2));
    }}