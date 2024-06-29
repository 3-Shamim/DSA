package com.learningstuff.algo;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/6/24
 * Time: 8:46 AM
 * Email: mdshamim723@gmail.com
 */

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int indx = binarySearch(arr, 10);

        System.out.println(indx);

    }

    public static int binarySearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;

    }

}
