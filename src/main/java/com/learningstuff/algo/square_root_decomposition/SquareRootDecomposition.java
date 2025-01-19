package com.learningstuff.algo.square_root_decomposition;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/19/25
 * Email: mdshamim723@gmail.com
 */

public class SquareRootDecomposition {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 3, 6, 2, 6, 2, 1, 9, 7};

        int sqrtLen = (int) Math.sqrt(arr.length);

        int[] temp = new int[sqrtLen + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i / 3] += arr[i];
        }

        // Find range sum from 1 to 7

        int rS = 1 ;
        int rE = 7;

        int sum = 0;

        for (int i = 0; i < temp.length; i++) {

            int s = i * sqrtLen;
            int e = (s + sqrtLen - 1);

            while (rS >= s && rS <= e) {
                sum +=
            }

        }

    }

}
