package nqueen.org;

public class NQueenProblem {

    // Function to print the board
    private static void printBoard(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((board[i][j] == 1 ? "Q " : "- "));
            }
            System.out.println();
        }
    }

    // Function to check if it's safe to place a queen at board[row][col]
    private static boolean isSafe(int[][] board, int row, int col, int N) {
        // Check the current column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Function to solve the N Queen problem using backtracking
    private static boolean solveNQueen(int[][] board, int row, int N) {
        if (row == N) { // If all queens are placed
            printBoard(board, N); // Print the board
            return true; // Found a solution
        }

        boolean res = false; // Track if any valid placement is found

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col, N)) {
                // Place the queen
                board[row][col] = 1;

                // Recur to place the rest of the queens
                res = solveNQueen(board, row + 1, N) || res;

                // Backtrack if placing queen here leads to no solution
                board[row][col] = 0;
            }
        }

        return res;
    }

    public static void solve(int N) {
        int[][] board = new int[N][N];

        if (!solveNQueen(board, 0, N)) {
            System.out.println("No solution exists");
        }
    }

    public static void main(String[] args) {
        int N = 8; // Example for 8-Queens
        solve(N);
    }
}
/*The N-Queen Problem is a classic backtracking algorithm problem. The goal is to place N queens on an N×N chessboard such that no two queens attack each other, meaning:

No two queens should be in the same row.
No two queens should be in the same column.
No two queens should be in the same diagonal.
Solution Explanation
To solve this problem, we can use backtracking. We start by placing the queen in the first row, then move to the next row and place the queen in a column where it's not attacked by the previously placed queens. If a row placement is invalid, we backtrack to the previous row and try a different column placement.

Approach:
Place the queen in the first column of the first row.
Check if the current placement is safe. A placement is safe if no other queen is placed in the same column, row, or diagonal.
Move to the next row and repeat the process for all rows.
If placing the queen in the current position leads to a solution, print the board. If not, backtrack and try another position.
Explanation:
isSafe(): This function checks whether a queen can be placed on the board without any other queen attacking it.

It checks the current column, the upper left diagonal, and the upper right diagonal.
solveNQueen(): This function tries to place queens in each row. If placing a queen at a position is safe, it moves to the next row. If not, it backtracks to the previous row and tries a different column.

Backtracking: The process of removing the queen from a position when the placement leads to no valid solution and trying other columns is backtracking.

Time Complexity: 
𝑂
(
𝑁
!
)
O(N!) because in the worst case, for each row, we try all columns.

Space Complexity: 
𝑂
(
𝑁
2
)
O(N 
2
 ) because we are using a 2D board to store the position of queens.

This solution finds all possible configurations of queens on the board and prints them. You can modify it to stop after finding the first valid solution by returning true as soon as a solution is found.*/