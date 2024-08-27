package com.learningstuff.algo.binary_search.problems.others;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 3/7/24
 * Time: 8:35 PM
 * Email: mdshamim723@gmail.com
 */


public class FindElementPositionFromSortedInfiniteArray {

    public static int findElementPosition(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        try {
            int[] range = findRange(arr, target);

            if (range[0] == -1) {
                return -1;
            }

            int start = range[0], end = range[1];

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }

        return -1;
    }

    private static int[] findRange(int[] arr, int target) {

        if (target < arr[0]) {
            return new int[]{-1, -1};
        }

        int start = 0, end = 0;

        while (true) {

            if (target >= arr[start] && target <= arr[end]) {
                return new int[]{start, end};
            }

            start = end + 1;
            end = (int) Math.pow(2, end);

        }

    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19};

        System.out.println(findElementPosition(arr, 5));

    }

}
