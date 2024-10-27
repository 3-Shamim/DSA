package com.learningstuff.recursion;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/27/24
 * Email: mdshamim723@gmail.com
 */

public class SelectionSort {

    static void selectionSort(int[] nums, int i) {

        if (i == nums.length) {
            return;
        }

        int maxIndex = findMaxIndex(nums, 0, nums.length - i, 0);

        int t = nums[nums.length - 1 - i];
        nums[nums.length - 1 - i] = nums[maxIndex];
        nums[maxIndex] = t;

        selectionSort(nums, i + 1);

    }

    private static int findMaxIndex(int[] nums, int s, int e, int maxIndex) {

        if (s == e) {
            return maxIndex;
        }

        if (nums[s] > nums[maxIndex]) {
            maxIndex = s;
        }

        return findMaxIndex(nums, s + 1, e, maxIndex);
    }

    public static void main(String[] args) {


        int[] nums = {4, 3, 2, 1};

        selectionSort(nums, 0);

        System.out.println(Arrays.toString(nums));

    }

}
