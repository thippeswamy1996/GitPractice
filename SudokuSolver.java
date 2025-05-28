public class SudokuSolver {

  
    public boolean solveSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // If empty cell found
                if (board[row][col] == '.') {
                    // Try all digits
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) return true;

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Solved!
    }

    // Check if placing num is valid
    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check row and column
            if (board[row][i] == num || board[i][col] == num)
				return false;

            // Check 3x3 subgrid
            int gridRow = 3 * (row / 3) + i / 3;
            int gridCol = 3 * (col / 3) + i % 3;
            if (board[gridRow][gridCol] == num) return false;
        }
        return true;
    }

    // Print the board
    public void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Original Sudoku:");
        solver.printBoard(board);

        if (solver.solveSudoku(board)) {
            System.out.println("\nSolved Sudoku:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
