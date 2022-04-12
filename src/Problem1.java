import java.util.HashSet;

class Problem1 {

    public  boolean notPoint(char symbol ){
        return symbol != '.';
    }
    public  boolean areConditionCorrect(char symbol){
        return symbol < '1' || symbol > '9';
    }

    // using Integer HashSet
    public  boolean validHashSet(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> rows = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                    if (notPoint(board[col][row]) && !columns.add(board[col][row]) | areConditionCorrect(board[col][row])) return false;
                    if (notPoint(board[row][col]) && !rows.add(board[row][col]) | areConditionCorrect(board[row][col])) return false;
            }
        }

        return true;
    }




    }