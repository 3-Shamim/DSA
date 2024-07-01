package com.learningstuff.algo.binary_search.problems;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 9:40 PM
 * Email: mdshamim723@gmail.com
 */

public class CellingOfANumber {

    static int ceilingOfANumber(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (target < nums[0]) {
            return -1;
        }

        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end -start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(ceilingOfANumber(nums, 0));
        System.out.println(ceilingOfANumber(nums, 4));
        System.out.println(ceilingOfANumber(nums, 9));
        System.out.println(ceilingOfANumber(nums, 10));

    }

}
