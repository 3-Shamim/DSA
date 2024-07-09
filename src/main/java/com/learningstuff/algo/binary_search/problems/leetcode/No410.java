package com.learningstuff.algo.binary_search.problems.leetcode;

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

    public static int splitArray1(int[] nums, int k) {

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

        if (k == 1 || nums.length == k) {
            return iMax;
        }

        int ans = iMax;

        for (int i = pos.length - 1; i > 0; i--) {

            for (int j = i; j < nums.length - (pos.length - i); j++) {

                int left = pos[i - 1] + nums[j];
                int right = pos[i] - nums[j];

                if (i == mPos) {

                    if (left > right) {
                        iMax = left;
                        mPos = i - 1;
                    } else {
                        iMax = right;
                    }

                } else if (i - 1 == mPos) {
                    iMax = left;
                }

                if (ans > iMax) {
                    ans = iMax;
                }

                pos[i - 1] = left;
                pos[i] = right;

            }

        }

        return ans;
    }

    public static int splitArray(int[] nums, int k) {

        int start = 0, end = 0;

        for (int num : nums) {

            if (start < num) {
                start = num;
            }

            end += num;

        }

        while (start < end) {

            int mid = start + (end - start) / 2;

            int subArrCount = 1;
            int sum = 0;

            for (int num : nums) {

                if ((sum + num) > mid) {
                    subArrCount++;
                    sum = num;
                } else {
                    sum += num;
                }

            }

            if (subArrCount > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end;
    }

    public static void main(String[] args) {

//        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 1));
//        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 2));
        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 3));
//        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 4));
//        System.out.println(splitArray(new int[]{70, 2, 5, 10, 8}, 3));
//        System.out.println(splitArray(new int[]{7, 2}, 2));
//        System.out.println(splitArray(new int[]{7, 11, 5, 10, 8}, 3));
//        System.out.println(splitArray(new int[]{1, 2, 3, 4, 5}, 2));

    }

}
