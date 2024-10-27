package com.learningstuff.recursion;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/27/24
 * Email: mdshamim723@gmail.com
 */

public class BubbleSort {

    static void bubbleSort(int[] nums, int i) {

        if (i == nums.length) {
            return;
        }

        swapData(nums, 0);

        bubbleSort(nums, i + 1);

    }

    private static void swapData(int[] nums, int i) {

        if (i == nums.length - 1) {
            return;
        }

        if (nums[i] > nums[i + 1]) {

            int t = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = t;
        }

        swapData(nums, i + 1);

    }


    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 1};

        bubbleSort(nums, 0);

        System.out.println(Arrays.toString(nums));

    }

}
