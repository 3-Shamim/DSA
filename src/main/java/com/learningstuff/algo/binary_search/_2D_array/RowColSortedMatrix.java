package com.learningstuff.algo.binary_search._2D_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 9/7/24
 * Time: 9:55 PM
 * Email: mdshamim723@gmail.com
 */

public class RowColSortedMatrix {

    static int[] searchInMatrix1(int[][] matrix, int target) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == target) {
                    return new int[]{row, col};
                }

            }

        }

        return new int[]{-1, -1};
    }


    static int[] searchInMatrix(int[][] matrix, int target) {

        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }

        }

        return new int[]{-1, -1};
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 38, 44, 50},
                {33, 43, 52, 54}
        };

        System.out.println(Arrays.toString(searchInMatrix(matrix, 38)));
        System.out.println(Arrays.toString(searchInMatrix(matrix, 66)));

    }

}
