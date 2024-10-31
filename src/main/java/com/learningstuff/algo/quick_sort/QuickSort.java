package com.learningstuff.algo.quick_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/30/24
 * Email: mdshamim723@gmail.com
 */

public class QuickSort {

    static void quickSort(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int s = l;
        int pivotIndex = l + (r - l) / 2;
        int e = r;
        int pivot = arr[pivotIndex];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

//            if (s <= e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
//            }

        }

        quickSort(arr, l, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, r);

    }

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{2, 1, 3, 5, 4};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

    }

}
