package com.learningstuff.algo.merge_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/27/24
 * Email: mdshamim723@gmail.com
 */

public class MergeSort {

    static void mergeSort(int[] arr, int l, int r) {

        if (l == r) {
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);

    }

    private static void merge(int[] arr, int s, int lEnd, int rEnd) {

        int lStart = s;
        int rStart = lEnd + 1;
        int index = 0;

        int[] sorted = new int[rEnd - lStart + 1];

        while (lStart <= lEnd && rStart <= rEnd) {

            if (arr[lStart] <= arr[rStart]) {
                sorted[index] = arr[lStart];
                lStart++;
            } else {
                sorted[index] = arr[rStart];
                rStart++;
            }

            index++;

        }

        if (lStart <= lEnd) {

            while (lStart <= lEnd) {
                sorted[index] = arr[lStart];
                lStart++;
                index++;
            }

        }

        if (rStart <= rEnd) {

            while (rStart <= rEnd) {
                sorted[index] = arr[rStart];
                rStart++;
                index++;
            }

        }

        System.arraycopy(sorted, 0, arr, s, sorted.length);

    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] f = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] s = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(f, s);
    }

    private static int[] merge(int[] f, int[] s) {

        int[] n = new int[f.length + s.length];

        int index = 0;
        int fIndex = 0;
        int sIndex = 0;

        while (fIndex < f.length && sIndex < s.length) {

            if (f[fIndex] < s[sIndex]) {
                n[index] = f[fIndex];
                fIndex++;
            } else {
                n[index] = s[sIndex];
                sIndex++;
            }

            index++;

        }

        if (fIndex != f.length) {

            while (fIndex < f.length) {
                n[index] = f[fIndex];
                fIndex++;
                index++;
            }

        }

        if (sIndex != s.length) {

            while (sIndex < s.length) {
                n[index] = s[sIndex];
                sIndex++;
                index++;
            }

        }

        return n;
    }


    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));

        int[] arr1 = {2, 3, 1};
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{2, 4, 6, 1, 7, 3};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 4, 3, 2, 1};
        mergeSort(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {3, 2, 4, 6, 6, 4, 2, 3, 8, 7};
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));


    }

}
