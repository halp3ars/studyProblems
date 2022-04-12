import java.util.HashSet;

public class Problem1 {


    // using Integer HashSet
    public static boolean IsValidHashSetInteger(char[][] board) {


        for (int i = 0; i < 9; i++) {
            int temp;
            HashSet<Integer> columns = new HashSet<>();
            HashSet<Integer> rows = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                    temp = Character.getNumericValue(board[i][j]);
                    if(board[i][j] != '.' && temp < 1 || temp > 9 ) return false;
                    if(board[j][i] != '.') {
                        if (!columns.add(i + board[j][i])) return false;
                    }
                    if(board[i][j] != '.') {
                        if (!rows.add(i + board[i][j])) return false;
                    }


            }

        }
        return true;
    }





    public static void main(String[] args) {
        char[][] board = {
                {'.', '3', '.', '.', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'3', '.', '.', '4', '1', '9', '.', '.', '5'},
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

        long time = System.nanoTime();
        System.out.println(IsValidHashSetInteger(board));
        long end = System.nanoTime();
        System.out.println(end - time);
    }}