package com.learningstuff.ds.stack.leetcode;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/5/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
 * */

public class No1541 {

    public static int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {

                if (!stack.isEmpty() && (i + 1) < s.length()) {
                    if (stack.peek() == '(' && s.charAt(i + 1) == ')') {
                        i++;
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }

            }

        }

        int count = 0;

        while (!stack.isEmpty()) {

            Character pop = stack.pop();

            if (stack.isEmpty()) {
                count += 2;
                break;
            }

            if (pop == '(') {
                count += 2;
            } else {
                count += 1;
                stack.pop();
            }

        }

        return count;
    }

    public static void main(String[] args) {
//        System.out.println(minInsertions("(()))"));
//        System.out.println(minInsertions("())"));
//        System.out.println(minInsertions("))())("));
//        System.out.println(minInsertions("())()(()"));
        // 31
        System.out.println(minInsertions("(((()(()((())))(((()())))()())))(((()(()()((()()))"));
    }

}
