class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int r = 0; r < 9; r++) {

            HashSet<Character> row = new HashSet<>();

            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') continue;

                if (row.contains(board[r][c])) {
                    return false;
                }

                row.add(board[r][c]);
            }
        }

        // Check columns
        for (int c = 0; c < 9; c++) {

            HashSet<Character> col = new HashSet<>();

            for (int r = 0; r < 9; r++) {

                if (board[r][c] == '.') continue;

                if (col.contains(board[r][c])) {
                    return false;
                }

                col.add(board[r][c]);
            }
        }

        // Check 3x3 boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {

            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> box = new HashSet<>();

                for (int r = boxRow; r < boxRow + 3; r++) {

                    for (int c = boxCol; c < boxCol + 3; c++) {

                        if (board[r][c] == '.') continue;

                        if (box.contains(board[r][c])) {
                            return false;
                        }

                        box.add(board[r][c]);
                    }
                }
            }
        }

        return true;
    }
}