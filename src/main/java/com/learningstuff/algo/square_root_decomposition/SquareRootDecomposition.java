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

        int[] temp = precomputeBlockSum(sqrtLen, arr);

        int sum = getRangeSum(temp, sqrtLen, arr, 1, 7);
        System.out.println(sum);

        int sum1 = getRangeSum(temp, sqrtLen, arr, 1, 2);
        System.out.println(sum1);

        int sum2 = getRangeSum(temp, sqrtLen, arr, 1, 1);
        System.out.println(sum2);

        int sum3 = getRangeSum(temp, sqrtLen, arr, 1, 4);
        System.out.println(sum3);

        int sum4 = getRangeSum(temp, sqrtLen, arr, 1, 5);
        System.out.println(sum4);

    }

    private static int[] precomputeBlockSum(int sqrtLen, int[] arr) {

        int[] temp = new int[sqrtLen + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i / 3] += arr[i];
        }

        return temp;
    }

    private static int getRangeSum(int[] temp, int sqrtLen, int[] arr, int rS, int rE) {

        int sum = 0;

        for (int i = 0; i < temp.length; i++) {

            int s = i * sqrtLen;
            int e = (s + sqrtLen - 1);

            if (s == rS && rE >= e) {
                sum += temp[i];
                rS += sqrtLen;
            } else if (rS > s) {

                int min = Math.min(e, rE);

                while (rS <= min) {
                    sum += arr[rS];
                    rS++;
                }

            } else if (rE < e) {

                while (rS <= rE) {
                    sum += arr[rS];
                    rS++;
                }

            }

            if (rS >= rE) {
                break;
            }

        }

        return sum;
    }

}
