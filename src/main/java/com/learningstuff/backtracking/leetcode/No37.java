package com.learningstuff.backtracking.leetcode;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/20/24
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/sudoku-solver/
 * */

public class No37 {

    public static void solveSudoku(char[][] board) {

        helper(board, 0, 0);

    }

    private static void helper(char[][] board, int row, int col) {

        if (row == board.length - 1 && col == board.length) {
            display(board);
            System.out.println();
            return;
        }

        if (col == board.length) {
            helper(board, row + 1, 0);
            return;
        }

        char c = board[row][col];

        if (c == '.') {

            for (int n = 1; n <= board.length; n++) {

                char cN = (char) (n + '0');

                if (isSafe(board, row, col, cN)) {

                    board[row][col] = cN;
                    helper(board, row, col + 1);
                    board[row][col] = c;

                }

            }

        } else {
            helper(board, row, col + 1);
        }

    }

    private static void display(char[][] board) {

        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }

    }

    private static boolean isSafe(char[][] board, int row, int col, char n) {

        for (char[] chars : board) {
            if (chars[col] == n) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {

            if (board[row][i] == n) {
                return false;
            }

        }

//        int sqrt = (int) Math.sqrt(board.length);
//
//        while (sqrt)

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'.', '4', '.', '.'},
                {'1', '.', '3', '.'},
                {'.', '3', '.', '.'},
                {'.', '.', '2', '.'}
        };

        char[][] board1 = {
                {'.', '.', '.', '.'},
                {'1', '.', '3', '.'},
                {'.', '3', '.', '.'},
                {'.', '.', '2', '.'}
        };

        solveSudoku(board1);

    }

}
