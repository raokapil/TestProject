package com.company.dataStructure.recursion;

public class SudukoSolver {


    public static void main (String[] args) {

        char[][] board = new char[9][9]; /*[["5","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]];*/
        sudukoSolver(board, 0, 0);
    }

    private static boolean sudukoSolver(char[][] board, int row, int col) {

        // Base case
        if (row == board.length) {
            return true;
        }

        // row and column value for next recursion cycle
        int newRow = 0;
        int newCol = 0;
        if (col == board.length - 1) {
            newRow = row + 1;
            newCol = 0;
        } else {
            newRow = row;
            newCol = col + 1;
        }

        // Some other number exist like 8,3, etc
        if (board[row][col] != '.') {
            if (sudukoSolver(board, newRow, newCol)) {
                return true;
            }
        } else {

            // try to place some number in cell
            for (int i = 1; i <= 9; i++) {

                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (sudukoSolver(board, newRow, newCol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, int i) {

        // for rows and column
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == (char) (i + '0')) {
                return false;
            }
            if (board[row][j] == (char) (i + '0')) {
                return false;
            }
        }

        // for Grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for (int j = sr; j < sr+3; j++) {
            for (int k = sc; k < sc+3; k++) {
                if (board[j][k] == (char) (i + '0')) {
                    return false;
                }
            }
        }

        return true;
    }
}
