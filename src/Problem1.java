import java.util.HashSet;

class Problem1 {

    public  boolean validateMatrix(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> rows = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                    if (isNotValidElement(board[col][row]) && !columns.add(board[col][row]) ) return false;
                    if (isNotValidElement(board[row][col]) && !rows.add(board[row][col]) ) return false;
            }
        }
        return true;
    }

    private boolean isNotValidElement(char symbol){
        boolean isNotPoint = symbol != '.';
        boolean isNotValidDigit = symbol < '1' || symbol > '9';
        return isNotPoint && isNotValidDigit;
    }
}