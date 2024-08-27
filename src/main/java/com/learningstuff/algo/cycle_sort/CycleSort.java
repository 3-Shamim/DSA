package com.learningstuff.algo.cycle_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class CycleSort {

    /* NOTE:
     * Cycle sort only works if the array contains 1 - n (consecutive sequence / contiguous sequence, range)
     * */

    private static int[] cycleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int currentValue = arr[i];

            if (i != currentValue - 1) {

                arr[i] = arr[currentValue - 1];
                arr[currentValue - 1] = currentValue;
                i--;

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(cycleSort(new int[]{5, 4, 3, 2, 1})));

    }

}
