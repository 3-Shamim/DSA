package com.learningstuff.backtracking;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/18/24
 * Email: mdshamim723@gmail.com
 */

public class NKnights {

    private static void nKnights(boolean[][] board, int row, int col, int n) {

        if (n == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            nKnights(board, row + 1, 0, n);
            return;
        }

        if (isKnightSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, n - 1);
            board[row][col] = false;
        }

        nKnights(board, row, col + 1, n);

    }

    private static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean col : row) {
                System.out.print(col ? "K" : "X");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static boolean isKnightSafe(boolean[][] board, int row, int col) {

        boolean result = false;

        if (insideBoard(board, row - 2, col + 1)) {
            result = board[row - 2][col + 1];
        }

        if (!result && insideBoard(board, row - 2, col - 1)) {
            result = board[row - 2][col - 1];
        }

        if (!result && insideBoard(board, row - 1, col + 2)) {
            result = board[row - 1][col + 2];
        }

        if (!result && insideBoard(board, row - 1, col - 2)) {
            result = board[row - 1][col - 2];
        }

        return !result;
    }

    private static boolean insideBoard(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        nKnights(board, 0, 0, n);

    }

}
