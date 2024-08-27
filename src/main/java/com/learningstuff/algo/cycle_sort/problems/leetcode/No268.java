package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/8/24
 * Time: 7:44 AM
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/missing-number/description/
 * */

public class No268 {

    // Apply Cycle Sort, Time O(n), Space O(1)
    public static int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (current < nums.length && i != current) {

                nums[i] = nums[current];
                nums[current] = current;
                i--;

            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (i != nums[i]) {
                return i;
            }

        }

        return nums.length;
    }

    // Using HashMap, Time O(n), Space O(n)
    public static int missingNumberHM(int[] nums) {

        // We can use Set also
        Map<Integer, Boolean> map = new HashMap<>();

        int max = -1;

        for (int n : nums) {
            max = Math.max(max, n);
            map.put(n, true);
        }

        for (int i = 0; i <= max; i++) {

            if (!map.containsKey(i)) {
                return i;
            }

        }

        return max + 1;
    }

    // Using Nested Loop, Time O(n^2), Space O(1)
    public static int missingNumberN(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {

            boolean found = false;

            for (int num : nums) {

                if (i == num) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                return i;
            }

        }

        return nums.length;
    }

    // Custom Approach (Best solution), Time O(n), Space O(1)
    public static int missingNumberC(int[] nums) {

        int max = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int completeSum = (max * (max + 1)) / 2;

        return completeSum - sum;
    }

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{3, 2, 1}));
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));

    }

}
