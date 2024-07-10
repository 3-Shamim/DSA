package com.learningstuff.algo.binary_search._2D_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/7/24
 * Time: 7:50 AM
 * Email: mdshamim723@gmail.com
 */

public class SortedMatrix {

    static int[] searchInMatrix(int[][] matrix, int target) {

        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (target > matrix[row][col]) {
                row++;
            } else if (target < matrix[row][0]) {
                return new int[]{-1, -1};
            } else {
                break;
            }

        }

        int resCol = binarySearch(matrix[row], target);

        if (resCol != -1) {
            return new int[]{row, resCol};
        }

        return new int[]{-1, -1};

    }

    static int binarySearch(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(RowColSortedMatrix.searchInMatrix1(matrix, 14)));
        System.out.println(Arrays.toString(RowColSortedMatrix.searchInMatrix(matrix, 14)));
        System.out.println(Arrays.toString(searchInMatrix(matrix, 14)));

    }

}
