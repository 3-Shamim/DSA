package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 30/8/24
 * Time: 7:32 AM
 * Email: mdshamim723@gmail.com
 */

public class No41 {

    // Cycle sort, Time O(n), Space O(1)
    public static int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (current < 1 || current > nums.length) {
                continue;
            }

            if (nums[current - 1] != current) {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }

        }

        return nums.length + 1;
    }

    // Using Boolean[], Time O(n), Space O(n)
    public static int firstMissingPositiveB(int[] nums) {

        boolean[] store = new boolean[nums.length + 1];

        for (int n: nums) {

            if (n < 1 || n > nums.length) {
                continue;
            }

            store[n] = true;

        }

        for (int i = 1; i < store.length; i++) {

            if (!store[i]) {
                return i;
            }

        }

        return nums.length + 1;
    }

    // Using HashSet, Time O(n), Space O(n)
    public static int firstMissingPositiveHS(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int max = nums[0];

        for (int n : nums) {
            if (n < 1) {
                continue;
            }
            set.add(n);
            max = Math.max(max, n);
        }

        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(new int[]{1}));
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));

    }

}
