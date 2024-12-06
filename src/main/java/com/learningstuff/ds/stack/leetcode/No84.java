package com.learningstuff.ds.stack.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/4/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 * */

public class No84 {

    public static int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int j = i;
            int count = 0;

            int min = Integer.MAX_VALUE;

            while (j >= 0) {

                count++;

                min = Math.min(min, heights[j]);

                maxArea = Math.max(maxArea, (min * count));

                j--;

            }

        }

        return maxArea;
    }

    public static int largestRectangleArea1(int[] heights) {

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int j = i;
            int count = 0;

            int min = Integer.MAX_VALUE;

            while (j >= 0) {

                count++;

                min = Math.min(min, heights[j]);

                maxArea = Math.max(maxArea, (min * count));

                j--;

            }

        }

        return maxArea;
    }

    public static void main(String[] args) {

        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(largestRectangleArea(new int[]{2, 4}));
        System.out.println(largestRectangleArea(new int[]{4, 4}));

    }

}
