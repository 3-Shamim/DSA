package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/8/24
 * Time: 9:06 AM
 * Email: mdshamim723@gmail.com
 */

public class No448 {

    // Using Cycle Sort, Time O(n), Space O(1)
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (nums[current - 1] != current) {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;

            }

        }

        for (int i = 1; i <= nums.length; i++) {

            int value = nums[i - 1];

            if (i != value) {
                result.add(i);
            }

        }

        return result;
    }

    // Using HashSet, Time O(n), Space O(1)
    public static List<Integer> findDisappearedNumbersS(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                result.add(i);
            }

        }

        return result;
    }

    // Using Nested Loop, Time O(n^2), Space O(1)
    public static List<Integer> findDisappearedNumbersN(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {

            boolean found = false;

            for (int num : nums) {

                if (num == i) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                result.add(i);
            }

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1, 1}));

    }

}
