package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 28/8/24
 * Time: 11:30 PM
 * Email: mdshamim723@gmail.com
 */

public class No187 {

    // Using Cycle Sort, Time O(n), Space O(1)
    public static int findDuplicateC(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (nums[current - 1] != current) {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;
            } else {

                if (current - 1 != i) {
                    return current;
                }

            }

        }

        return -1;
    }

    // Using extra space with boolean[], Time O(n), Space O(n)
    public static int findDuplicateS(int[] nums) {

        boolean[] store = new boolean[nums.length + 1];

        for (int n: nums) {

            if (store[n]) {
                return n;
            }

            store[n] = true;

        }

        return -1;
    }

    // Using HashSet, Time O(n), Space O(n)
    public static int findDuplicateH(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n: nums) {

            boolean add = set.add(n);

            if (!add) {
                return n;
            }

        }

        return -1;
    }

    // Custom Approach, Time O(n), Space O(1)
    public static int findDuplicate(int[] nums) {

        for (int num: nums) {

            int index = Math.abs(num);

            if (nums[index - 1] < 0) {
                return index;
            }

            nums[index - 1] = -nums[index - 1];

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(findDuplicate(new int[]{3, 3, 3, 3, 3}));

    }

}
