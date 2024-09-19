package com.learningstuff.bitwise.leetcode;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 10:39 PM
 * Email: mdshamim723@gmail.com
 */

public class No832 {

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int start = 0;
            int end = image[i].length - 1;

            while (start <= end) {

                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;

                start++;
                end--;
            }

        }

        return image;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}})));

    }

}
