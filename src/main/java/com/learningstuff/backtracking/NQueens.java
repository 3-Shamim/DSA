package com.learningstuff.backtracking;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/17/24
 * Email: mdshamim723@gmail.com
 */

public class NQueens {

    private static int nQueens(boolean[][] board, int row) {

        if (row >= board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (isQueenSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueens(board, row + 1);
                board[row][col] = false;
            }

        }

        return count;
    }

    private static boolean isQueenSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (board[i][col]) {
                return false;
            }

        }

        for (int i = 1; i <= Math.min(row, col); i++) {

            if (board[row - i][col - i]) {
                return false;
            }

        }

        int len = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= len; i++) {

            if (board[row - i][col + i]) {
                return false;
            }

        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] bR : board) {
            for (boolean bC : bR) {
                System.out.print(bC ? "Q" : "X");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        System.out.println(nQueens(board, 0));

    }

}
