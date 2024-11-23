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

//        allSudoku(board, 0, 0);
//        sudokuSolver(board, 0, 0);

        sudokuSolver(board);

        display(board);

    }

    private static boolean sudokuSolver(char[][] board) {

        int len = board.length;
        int row = 0;
        int col = 0;

        boolean completed = true;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                row = i;
                col = j;

                if (board[i][j] == '.') {
                    completed = false;
                    break;
                }

            }

            if (!completed) {
                break;
            }

        }

        if (completed) {
            return true;
        }

        for (int n = 1; n <= len; n++) {

            char cN = (char) (n + '0');

            if (isSafe(board, row, col, cN)) {
                board[row][col] = cN;
                if (sudokuSolver(board)) {
                    return true;
                } else {
                    board[row][col] = cN;
                }
            }

        }


        return false;
    }

    private static boolean sudokuSolver(char[][] board, int row, int col) {

        if (row == board.length - 1 && col == board.length) {
            return true;
        }

        if (col == board.length) {
            return sudokuSolver(board, row + 1, 0);
        }

        char c = board[row][col];

        if (c == '.') {

            for (int n = 1; n <= board.length; n++) {

                char cN = (char) (n + '0');

                if (isSafe(board, row, col, cN)) {

                    board[row][col] = cN;
                    if (sudokuSolver(board, row, col + 1)) {
                        return true;
                    }
                    board[row][col] = c;

                }

            }

        } else {
            return sudokuSolver(board, row, col + 1);
        }

        return false;
    }

    private static void allSudoku(char[][] board, int row, int col) {

        if (row == board.length - 1 && col == board.length) {
            display(board);
            System.out.println();
            return;
        }

        if (col == board.length) {
            allSudoku(board, row + 1, 0);
            return;
        }

        char c = board[row][col];

        if (c == '.') {

            for (int n = 1; n <= board.length; n++) {

                char cN = (char) (n + '0');

                if (isSafe(board, row, col, cN)) {

                    board[row][col] = cN;
                    allSudoku(board, row, col + 1);
                    board[row][col] = c;

                }

            }

        } else {
            allSudoku(board, row, col + 1);
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

        // Sub box len
        int subBoxLen = (int) Math.sqrt(board.length);

        int[] subBoxIndex = findSubBoxIndex(row, col, subBoxLen);

        for (int i = 0; i < subBoxLen; i++) {

            for (int j = 0; j < subBoxLen; j++) {

                if (board[i + subBoxIndex[0]][j + subBoxIndex[1]] == n) {
                    return false;
                }

            }

        }

        return true;
    }

    private static int[] findSubBoxIndex(int row, int col, int subBoxLen) {

        int i = row - (row % subBoxLen);
        int j = col - (col % subBoxLen);

        return new int[]{i, j};
    }

    private static int[] findSubBoxIndex(int row, int col, int len, int subBoxLen) {

        for (int i = 0; i < len; i = i + subBoxLen) {
            for (int j = 0; j < len; j = j + subBoxLen) {
                if (row >= i && row < (i + subBoxLen) && col >= j && col < (j + subBoxLen)) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
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
