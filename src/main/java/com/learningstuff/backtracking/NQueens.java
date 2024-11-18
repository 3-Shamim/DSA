package com.learningstuff.backtracking;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/17/24
 * Email: mdshamim723@gmail.com
 */

public class NQueens {

    private static void nQueens(boolean[][] board, int row) {

        if (row >= board.length) {

            for (boolean[] bR : board) {
                System.out.println(Arrays.toString(bR));
            }
            System.out.println("=====================");

            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isQueenSafe(board, row, col)) {
                board[row][col] = true;
                nQueens(board, row + 1);
                board[row][col] = false;
            }

        }

    }

    private static boolean isQueenSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (board[i][col]) {
                return false;
            }

        }

        for (int i = 0; i < Math.min(row, col); i++) {

            if (board[row - (i + 1)][col - (i + 1)]) {
                return false;
            }

        }

        for (int i = Math.max(row, col) + 1; i < board.length; i++) {

            int

            if (board[board.length - i][]) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        nQueens(board, 0);

    }

}
