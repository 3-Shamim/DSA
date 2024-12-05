package com.learningstuff.ds.stack.leetcode;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/5/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/valid-parentheses/description/
 * */

public class No20 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (c == ')' && pop != '(') {
                    return false;
                }
                if (c == '}' && pop != '{') {
                    return false;
                }
                if (c == ']' && pop != '[') {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));

    }

}
