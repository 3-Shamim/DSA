package com.learningstuff.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/15/24
 * Email: mdshamim723@gmail.com
 */

public class PossiblePathToReachMatrixEnd {

    private static void possiblePathToReachMatrixEnd(int[][] matrix, Integer[] index, List<Integer[]> res) {

        int mLen = matrix.length - 1;
        int l = index[0];
        int r = index[1];

        if (l == mLen && r == mLen) {
            res.add(index);
            System.out.println(res.stream().map(Arrays::toString).collect(Collectors.toList()));
            return;
        }

        res.add(index);

        if (l + 1 <= mLen) {
            possiblePathToReachMatrixEnd(matrix, new Integer[]{l + 1, r}, new ArrayList<>(res));
        }

        if (r + 1 <= mLen) {
            possiblePathToReachMatrixEnd(matrix, new Integer[]{l, r + 1}, new ArrayList<>(res));
        }

    }

    private static int countPath(int[][] matrix, Integer[] index) {

        int l = index[0];
        int r = index[1];

        if (l == 1 || r == 1) {
            return 1;
        }

        int a = countPath(matrix, new Integer[]{l - 1, r});
        a += countPath(matrix, new Integer[]{l, r - 1});

        return a;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        possiblePathToReachMatrixEnd(matrix, new Integer[]{0, 0}, new ArrayList<>());

        System.out.println(
                countPath(matrix, new Integer[]{matrix.length, matrix[0].length})
        );

    }

}
