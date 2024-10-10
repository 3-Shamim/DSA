package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/10/24
 * Email: mdshamim723@gmail.com
 */

public class FindSortedArray {

    static boolean isArraySorted(int[] arr) {

        if (arr == null || arr.length < 2) {
            return true;
        }

        return helper(arr, 1) == arr.length;
    }

    private static int helper(int[] arr, int i) {

        if (i >= arr.length) {
            return i;
        }

        if (arr[i] < arr[i - 1]) {
            return i;
        }

        return helper(arr, i + 1);
    }

    public static void main(String[] args) {

        System.out.println(isArraySorted(new int[]{1, 2, 3, 4}));
        System.out.println(isArraySorted(new int[]{1, 6, 9, 10}));
        System.out.println(isArraySorted(new int[]{1, 9, 6, 10}));
        System.out.println(isArraySorted(new int[]{1}));
        System.out.println(isArraySorted(new int[]{}));

    }

}
