package com.learningstuff.algo.quick_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/1/24
 * Email: mdshamim723@gmail.com
 */

public class QuickSort {

    private static void quickSort(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int pIndex = placePivotInRightPosition1(arr, l, r);

        quickSort(arr, l, pIndex - 1);
        quickSort(arr, pIndex + 1, r);

    }

    private static int placePivotInRightPosition(int[] arr, int l, int r) {

        int[] temp = new int[r - l + 1];
        int s = 0;
        int e = temp.length - 1;

        int m = l + (r - l) / 2;
        int pivot = arr[m];

        for (int i = l; i <= r; i++) {

            if (i == m) {
                continue;
            }

            if (arr[i] <= pivot) {
                temp[s] = arr[i];
                s++;
            } else {
                temp[e] = arr[i];
                e--;
            }

        }

        temp[s] = pivot;

        System.arraycopy(temp, 0, arr, l, temp.length);

        return s + l;
    }

    private static int placePivotInRightPosition1(int[] arr, int l, int r) {

        int m = l + (r - l) / 2;
        int pivot = arr[m];

        swap(arr, m, r);

        int i = l;

        for (int j = l; j <= r; j++) {

            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }

        }

        return i - 1;

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{2, 4, 6, 1, 7, 3};
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 4, 3, 2, 1};
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {3, 2, 4, 6, 6, 4, 2, 3, 8, 7};
        quickSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));

    }

}
