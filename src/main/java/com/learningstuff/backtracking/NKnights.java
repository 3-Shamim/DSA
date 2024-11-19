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
            return;
        }

        for (int i = row; i < board.length; i++) {

            for (int j = col; j < board[i].length; j++) {

                System.out.println(i + " " + j);
                nKnights(board, i, j + 1, n);
                nKnights(board, i + 1, j, n);

            }

        }


    }

    private static boolean isKnightSafe() {
        return true;
    }

    public static void main(String[] args) {

        int n = 2;

        boolean[][] board = new boolean[n][n];

        nKnights(board, 0, 0, n);

    }

}
