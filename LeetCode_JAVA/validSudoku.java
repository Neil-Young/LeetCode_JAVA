public class validSudoku {
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
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean flag = isValidSudoku(board);
        System.out.println(flag);

    }

    public static boolean isValidSudoku(char[][] board) {
        boolean flag = true;

        //validate all of the 9 rows
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                for (int z = j + 1; z < board[0].length; z++) {
                    if (board[i][j] == board[i][z] && board[i][j] != '.') {
                        flag = false;
                        break;
                    }
                }
            }
        }

        //validate all of the 9 columns
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                for (int z = i + 1; z < board.length; z++) {
                    if (board[i][j] == board[z][j] && board[i][j] != '.') {
                        flag = false;
                        break;
                    }
                }
            }
        }

        //validate all of the 9 sub-boxes
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[0].length; j = j + 3) {
                String str = "";
                for (int row = i; row < i + 3; row++) {
                    for (int column = j; column < j + 3; column++) {
                        if (str.contains(Character.toString(board[row][column])) && board[row][column] != '.') {
                            flag = false;
                            break;
                        } else {
                            str += Character.toString(board[row][column]);
                        }
                    }
                }
            }
        }
        return flag;
    }
}
