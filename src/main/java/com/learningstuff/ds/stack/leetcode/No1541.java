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

        Stack<Integer> stack = new Stack<>();

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {

                if (stack.isEmpty() || stack.peek() == 2) {
                    stack.push(2);
                } else {
                    stack.pop();
                    stack.push(2);
                    ans++;
                }

            } else {

                if (stack.isEmpty()) {
                    stack.push(1);
                    ans++;
                } else if (stack.peek() == 2) {
                    stack.pop();
                    stack.push(1);
                } else {
                    stack.pop();
                }

            }

        }

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
        System.out.println(minInsertions("())"));
        System.out.println(minInsertions("))())("));
        System.out.println(minInsertions("())()(()"));
        System.out.println(minInsertions("(()))(()))()())))"));
        System.out.println(minInsertions("(((()(()((())))(((()())))()())))(((()(()()((()()))"));
    }

}
