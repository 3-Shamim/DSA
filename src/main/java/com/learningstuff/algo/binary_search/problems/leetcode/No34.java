package com.learningstuff.algo.binary_search.problems.leetcode;

import java.util.Arrays;

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

public class No34 {

    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        if (nums == null || nums.length == 0) {
            return result;
        }

        result[0] = find(nums, target, true);
        result[1] = find(nums, target, false);

        return result;
    }

    private static int find(int[] nums, int target, boolean first) {

        int start = 0, end = nums.length - 1;

        int found = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                found = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return found;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));

    }

}
