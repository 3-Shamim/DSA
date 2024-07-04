package com.learningstuff.algo.binary_search.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/find-in-mountain-array/description/
 */

public class No1095 {

    //    public int findInMountainArray(int target, MountainArray mountainArr) {
    public static int findInMountainArray(int target, int[] arr) {

        int peak = findPeak(arr, arr.length);

        int l = binarySearch(arr, target, 0, peak, true);

        if (l == -1) {
            return binarySearch(arr, target, peak, arr.length - 1, false);
        }

        return l;
    }

    private static int binarySearch(int[] arr, int target, int start, int end, boolean asc) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                if (asc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (asc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    private static int findPeak(int[] arr, int length) {

        int start = 0, end = length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {

//        System.out.println(findInMountainArray(1, new int[]{0, 1, 0}));
//        System.out.println(findInMountainArray(1, new int[]{0, 1, 2}));
//        System.out.println(findInMountainArray(1, new int[]{0, 2, 1, 0}));
//        System.out.println(findInMountainArray(1, new int[]{0, 10, 5, 2}));
        System.out.println(findInMountainArray(1, new int[]{0, 4, 8, 10, 9, 7, 5, 2, 1}));
//        System.out.println(findInMountainArray(1, new int[]{1, 2, 5, 9, 11, 2, 1}));

    }

}
