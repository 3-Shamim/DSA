package com.learningstuff.algo.binary_search.problems.leetcode;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 6/7/24
 * Time: 10:49 AM
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/split-array-largest-sum/description/
 */

public class No410 {

    public static int splitArray(int[] nums, int k) {

        int[] pos = new int[k];

        int iMax = 0;
        int mPos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < k - 1) {
                pos[i] += nums[i];
                if (iMax < pos[i]) {
                    iMax = pos[i];
                    mPos = i;
                }
            } else {
                pos[k - 1] += nums[i];
                if (iMax < pos[k - 1]) {
                    iMax = pos[k - 1];
                    mPos = k - 1;
                }
            }

        }

        System.out.println(Arrays.toString(pos));
        System.out.println(iMax);
        System.out.println(mPos);

        for (int i = pos.length - 1; i >= 0; i--) {

            for (int j = i; j < nums.length - (pos.length - 1 - i); j++) {
                pos[i] = j;
            }

        }

        System.out.println(Arrays.toString(pos));

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 2));
        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 3));
//        System.out.println(splitArray(new int[]{7, 11, 5, 10, 8}, 3));
//        System.out.println(splitArray(new int[]{1, 2, 3, 4, 5}, 2));

    }

}
