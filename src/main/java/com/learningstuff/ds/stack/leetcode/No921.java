package com.learningstuff.ds.stack.leetcode;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/5/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
 * */

public class No921 {

    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }

        return stack.size();
    }

    public static void main(String[] args) {

        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));

    }

}
