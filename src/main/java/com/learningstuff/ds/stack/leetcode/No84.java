package com.learningstuff.ds.stack.leetcode;

import java.util.Stack;

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

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int h = i == heights.length ? 0 : heights[i];

            if (stack.isEmpty() || h >= heights[stack.peek()]) {
                stack.push(i);
            } else {

                int top = stack.pop();

                int count = stack.isEmpty() ? i : i - 1 - stack.peek();

                maxArea = Math.max(maxArea, heights[top] * count);

                i--;

            }

        }

        return maxArea;
    }

    public static int largestRectangleArea1(int[] heights) {

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int count = 0;

            for (int j = i + 1; j < heights.length; j++) {

                if (heights[i] > heights[j]) {
                    break;
                }

                count++;

            }

            maxArea = Math.max(maxArea, heights[i] * (count + 1));

        }

        return maxArea;
    }

    public static void main(String[] args) {

//        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
//        System.out.println(largestRectangleArea(new int[]{2, 4}));
//        System.out.println(largestRectangleArea(new int[]{1, 2, 4, 3, 1}));
//        System.out.println(largestRectangleArea(new int[]{4, 4}));
//        System.out.println(largestRectangleArea(new int[]{1, 3, 4, 3, 1}));
//        System.out.println(largestRectangleArea(new int[]{1, 3, 4, 4, 3, 1}));
//        System.out.println(largestRectangleArea(new int[]{1, 1}));
        System.out.println(largestRectangleArea(new int[]{4, 2, 0, 3, 2, 5}));

    }

}
