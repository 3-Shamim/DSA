package com.learningstuff.algo.binary_search.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

public class No33 {

    // Solve with linear search
    public static int search1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Solve with binary search
    public static int search(int[] nums, int target) {

        int peek = findPivot(nums);

        if (target >= nums[0] && target <= nums[peek]) {
            return binarySearch(nums, target, 0, peek);
        } else {
            return binarySearch(nums, target, peek + 1, nums.length - 1);
        }

    }

    private static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    private static int findPivot(int[] nums) {

        int start = 0, end = nums.length - 1;

        while (start < end) {

            if (nums[start] < nums[end]) {
                return end;
            }

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[start]) {
                start = mid;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(search(new int[]{1}, 0));
        System.out.println(search(new int[]{6, 7, 1, 3, 4}, 0));
        System.out.println(search(new int[]{5, 7, 7, 8, 8, 10}, 8));
        System.out.println(search(new int[]{2, 1}, 1));
        System.out.println(search(new int[]{4, 4, 4, 7, 7, 7, 9, 9, 1, 1, 2, 2}, 1));
        System.out.println(search(new int[]{4, 4, 4}, 1));

    }

}
