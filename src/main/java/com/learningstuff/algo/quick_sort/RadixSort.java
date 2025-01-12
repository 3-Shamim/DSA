package com.learningstuff.algo.quick_sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/12/25
 * Email: mdshamim723@gmail.com
 */

public class RadixSort {

    public static void main(String[] args) {

        int[] arr = new int[]{29, 24, 30, 3, 120, 11};

        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; exp <= max; exp *= 10) {
            countSortForRadix(arr, exp);
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void countSortForRadix(int[] arr, int exp) {

        int[] counts = new int[10];
        int[] updated = new int[arr.length];

        for (int v : arr) {
            int digit = (v / exp) % 10;
            counts[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            updated[counts[digit] - 1] = arr[i];
            counts[digit]--;
        }

        System.arraycopy(updated, 0, arr, 0, arr.length);

    }

}
