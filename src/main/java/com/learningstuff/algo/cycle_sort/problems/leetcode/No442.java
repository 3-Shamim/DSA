package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/8/24
 * Time: 8:13 AM
 * Email: mdshamim723@gmail.com
 */

public class No442 {

    // Using cycle sort, Time O(n), Space O(1)
    public static List<Integer> findDuplicate(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (nums[current - 1] != current)  {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (i != nums[i] - 1) {
                result.add(nums[i]);
            }

        }

        return result;
    }


    // Using Custom Approach, Time O(n), Space O(1)
    public static List<Integer> findDuplicateB(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }

        }

        return result;
    }

    // Using HashSet, Time O(n), Space O(n)
    public static List<Integer> findDuplicateH(int[] nums) {

        List<Integer> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {

            boolean add = set.add(n);

            if (!add) {
                result.add(n);
            }

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDuplicate(new int[]{1, 1, 2}));
        System.out.println(findDuplicate(new int[]{1}));

    }

}
