package com.learningstuff;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/8/24
 * Email: mdshamim723@gmail.com
 */

public class TicTacToe {

    public static void main(String[] args) {

        int len = 3;

        char[][] board = new char[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = ' ';
            }
        }

        displayBoard(board);

        Scanner scanner = new Scanner(System.in);
        char player = 'X';

        while (true) {

            System.out.println("Please input your indexes:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= len || col < 0 || col >= len) {
                System.out.println("Player: " + player + " did a wrong move. Please try again:");
                continue;
            }

            if (board[row][col] != ' ') {
                System.out.println("Player: " + player + " did a wrong move. Please try again:");
            } else {

                board[row][col] = player;
                boolean gameOver = displayBoard(board);

                if (won(board, row, col, player)) {
                    System.out.println("Player: " + player + " won the game.");
                    break;
                }

                if (gameOver) {
                    System.out.println("Game over.");
                    break;
                }

                player = player == 'X' ? 'O' : 'X';

            }

        }

    }

    private static boolean won(char[][] board, int row, int col, char player) {

        boolean won = true;

        // check all columns for a row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != player) {
                won = false;
                break;
            }
        }

        if (won) {
            return true;
        }

        won = true;

        // check all rows for a column
        for (char[] chars : board) {

            if (chars[col] != player) {
                won = false;
                break;
            }

        }

        if (won) {
            return true;
        }

        // check diagonal
        if (row == col) {

            won = true;

            for (int i = 0; i < board.length; i++) {

                if (board[i][i] != player) {
                    won = false;
                    break;
                }

            }

        }

        return won;
    }

    private static boolean displayBoard(char[][] board) {

        boolean gameOver = true;

        for (char[] row : board) {

            for (char col : row) {

                System.out.print(col + " |");

                if (gameOver && col == ' ') {
                    gameOver = false;
                }

            }

            System.out.println();

        }

        return gameOver;
    }

}
