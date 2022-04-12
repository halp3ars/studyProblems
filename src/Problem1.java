import java.util.HashSet;

public class Problem1 {

    public static boolean Valid(char[][] board){

        int temp ;
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] != '.') {
                    temp = Character.getNumericValue(chars[j]);
                    if (temp == -1 | temp > 9 | temp < 1) return false;
                }
            }
        }
        return true;
    }
    // using String HashSet
   public static boolean IsValidHashSetString(char[][] board) {


       boolean valida = Valid(board);
       if (!valida) return false;

       HashSet<String> set = new HashSet<>();

           for (int i = 0; i < 9; i++) {
               for (int j = 0; j < 9; j++) {
                   if (board[i][j] != '.') {
                       if (!set.add("col" + j + board[i][j]) || !set.add("row" + i + board[i][j])) return false;
                   }
               }
           }
       return true;
   }


    // using Integer HashSet
    public static boolean IsValidHashSetInteger(char[][] board) {

        boolean valida = Valid(board);
        if (!valida) return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.'){
                    if (!set.add(i * 10 + board[i][j]) || !set.add(100 + j * 10 + board[i][j])) return false;
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '7', '.', '.', '.', '.', '.', '.'},
                {'6', '7', '.', '1', '9', '5', '.', '.', '.'},
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

        System.out.println(IsValidHashSetString(board));
    }}