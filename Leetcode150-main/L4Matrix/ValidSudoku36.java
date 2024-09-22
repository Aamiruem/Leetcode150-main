package L4Matrix;

import java.util.HashMap;

public class ValidSudoku36 {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (map2.containsKey(board[i][j])) {
                    return false;
                }
                map2.put(board[i][j], 1);
            }
            map2.clear();
        }
        map2.clear();
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (map2.containsKey(board[i][j])) {
                    return false;
                }
                map2.put(board[i][j], 1);
            }
            map2.clear();
        }
        map2.clear();
        int i = 0;
        int m = 0;
        while (i < board.length && m < board[0].length) {
            for (int k = i; k < i + 3; k++) {
                for (int j = m; j < m + 3; j++) {
                    if (board[k][j] == '.') {
                        continue;
                    }
                    if (map2.containsKey(board[k][j])) {
                        return false;
                    }
                    map2.put(board[k][j], 1);
                }
            }
            i = i + 3;
            if (i >= board.length) {
                m = m + 3;
                i = 0;
            }
            map2.clear();
        }
        return true;
    }

    public static void main(String[] args) {

        ValidSudoku36 obj = new ValidSudoku36();

        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(obj.isValidSudoku(board));

    }
}
