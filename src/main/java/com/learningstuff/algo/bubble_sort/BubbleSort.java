package com.learningstuff.algo.bubble_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }

            }

            if (!swapped) {
                break;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(new int[]{})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{-4})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 6, 3, 2, 1})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{4,3,2,1})));

    }

}
