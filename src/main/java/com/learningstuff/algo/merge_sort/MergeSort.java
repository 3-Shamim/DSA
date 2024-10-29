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

        System.out.printf("l=%d, r=%d\n", l, r);

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


    }

}
