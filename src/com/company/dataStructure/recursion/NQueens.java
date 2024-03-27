package com.company.dataStructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {

        int N = 4;
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[N][N];
        helper(board, allBoards, 0);

        for (List<String> s : allBoards) {

            s.stream().forEach(e -> System.out.println(e));
            System.out.println();
        }
    }

    private static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {

            saveBoard(board, allBoards);
            return;
        }

        // Check for each row
        for (int row = 0; row < board.length; row++) {

            // isSafe check existence of Queen on that cell
            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }

    }

    private static void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        String row = "";

        for (int i = 0; i < board.length ; i++) {
            row = "";

            for (int j = 0; j < board.length; j ++) {

                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    private static boolean isSafe(int row, int col, char[][] board) {

        // horizontal safe
        for (int c = 0; c <board.length; c++) {
            if (board[row][c] == 'Q') {
                return false;
            }
        }

        // Vertical safe
        for (int r = 0; r <board.length; r++) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }

        //Upper Left
        for (int c = col, r =row; r >= 0 && c >= 0; r--,c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Lower Left
        for (int c = col, r =row; r < board.length && c >= 0; r++,c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Upper Right
        for (int c = col, r =row; c < board.length && r >= 0; r--,c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Upper Right
        for (int c = col, r =row; c < board.length && r < board.length; r++,c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
