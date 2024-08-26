package com.learningstuff.algo.selection_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 25/8/24
 * Time: 10:48 PM
 * Email: mdshamim723@gmail.com
 */

public class SelectionSort {

    // Min swipe
    private static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        return arr;
    }

    // Max swipe
    private static int[] selectionSort1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int maxIndex = 0;

            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }

            }

            int lastIndex = arr.length - 1 - i;

            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;

        }

        return arr;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(selectionSort(new int[]{})));
        System.out.println(Arrays.toString(selectionSort(new int[]{-4})));
        System.out.println(Arrays.toString(selectionSort(new int[]{4, 6, 3, 2, 1})));
        System.out.println(Arrays.toString(selectionSort(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(selectionSort(new int[]{4,3,2,1})));

    }

}
