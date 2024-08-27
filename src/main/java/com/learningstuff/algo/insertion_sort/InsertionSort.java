package com.learningstuff.algo.insertion_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class InsertionSort {

    private static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j - 1] < arr[j]) {
                    break;
                }

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

            }

        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(insertionSort(new int[]{})));
        System.out.println(Arrays.toString(insertionSort(new int[]{-1})));
        System.out.println(Arrays.toString(insertionSort(new int[]{4, 2, 1, 5, 3})));
        System.out.println(Arrays.toString(insertionSort(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(insertionSort(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(insertionSort(new int[]{4, 6, 3, 2, 1})));
        System.out.println(Arrays.toString(insertionSort(new int[]{4, 6, 3, 2, 1, -4})));


    }

}
