package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/8/24
 * Time: 9:45 PM
 * Email: mdshamim723@gmail.com
 */

public class No645 {

    // Using Array, Time O(n), Space O(n)
    public static int[] findErrorNums(int[] nums) {

        int[] res = new int[2];

        int[] freq = new int[nums.length + 1];

        for (int n : nums) {
            freq[n]++;
        }

        for (int i = 1; i <= nums.length; i++) {

            if (freq[i] == 0) {
                res[1] = i;
            } else if (freq[i] > 1) {
                res[0] = i;
            }

        }

        return res;
    }

    // Cycle sort, Time O(n), Space O(1)
    public static int[] findErrorNumsC(int[] nums) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (nums[current - 1] != current) {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;

            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] - 1 != i) {
                res[0] = nums[i];
                res[1] = i + 1;
            }

        }

        return res;
    }

    // Using HashMap, Time O(n), Space O(n)
    public static int[] findErrorNumsHM(int[] nums) {

        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!map.containsKey(i)) {
                res[1] = i;
            } else {

                if (map.get(i) > 1) {
                    res[0] = i;
                }

            }

        }

        return res;
    }

    // Using HashSet, Time O(n), Space O(n)
    public static int[] findErrorNumsHS(int[] nums) {

        int[] res = new int[2];

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {

            boolean add = set.add(n);

            if (!add) {
                res[0] = n;
            }

        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));

    }

}
