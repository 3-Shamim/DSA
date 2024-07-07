package com.learningstuff.algo.binary_search.problems;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 5/7/24
 * Time: 9:36 PM
 * Email: mdshamim723@gmail.com
 */

public class RotationCountInRotatedArray {


    static int findCountByLS(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }

        return 0;
    }

    // Solve with binary search
    static int findCountByBS(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        return (findPivot(arr) + 1) % arr.length;
    }

    private static int findPivot(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {

            if (arr[end] >= arr[start]) {
                return end;
            }

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[start]) {
                start = mid;
            } else {
                end = mid - 1;
            }

        }


        return start;
    }

    public static void main(String[] args) {

        System.out.println(findCountByBS(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findCountByBS(new int[]{15, 18, 2, 3, 6, 12}));


    }

}
