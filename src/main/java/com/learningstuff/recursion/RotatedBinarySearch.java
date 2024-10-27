package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/25/24
 * Email: mdshamim723@gmail.com
 */

public class RotatedBinarySearch {

    static int rotatedBinarySearch(int[] nums, int t, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (nums[m] == t) {
            return m;
        }

        // For ignore duplicate
        while (s < m && nums[s] == nums[m]) {
            s++;
        }

        // For ignore duplicate
        while (e > m && nums[e] == nums[m]) {
            e--;
        }

        if (nums[m] >= nums[s]) {
            if (t >= nums[s] && t < nums[m]) {
                return rotatedBinarySearch(nums, t, s, m - 1);
            } else {
                return rotatedBinarySearch(nums, t, m + 1, e);
            }
        }

        if (t > nums[m] && t <= nums[e]) {
            return rotatedBinarySearch(nums, t, m + 1, e);
        } else {
            return rotatedBinarySearch(nums, t, s, m - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println(rotatedBinarySearch(new int[]{1, 2, 3, 4}, 3, 0, 3));
        System.out.println(rotatedBinarySearch(new int[]{5, 6, 7, 1, 2, 3, 4}, 3, 0, 6));
        System.out.println(rotatedBinarySearch(new int[]{5, 6, 7, 1, 2, 3, 4}, 1, 0, 6));
        System.out.println(rotatedBinarySearch(new int[]{5, 6, 7, 1, 2, 3, 4}, 6, 0, 6));
        System.out.println(rotatedBinarySearch(new int[]{5, 6, 1, 2, 3, 4}, 7, 0, 5));
        System.out.println(rotatedBinarySearch(new int[]{2, 1}, 2, 0, 1));
        System.out.println(rotatedBinarySearch(new int[]{2, 1}, 1, 0, 1));
        System.out.println(rotatedBinarySearch(new int[]{2, 2, 2, 2, 1}, 1, 0, 4));

    }

}
