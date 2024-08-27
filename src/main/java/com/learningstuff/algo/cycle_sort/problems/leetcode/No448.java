package com.learningstuff.algo.cycle_sort.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/8/24
 * Time: 9:06 AM
 * Email: mdshamim723@gmail.com
 */

public class No448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (i != current - 1) {

                nums[i] = nums[current - 1];
                nums[current - 1] = current;

                i--;
            }

        }

        System.out.println(Arrays.toString(nums));

        return result;
    }

    public static void main(String[] args) {

        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1, 1}));

    }

}
