package com.learningstuff.ds.linkedlist.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/28/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/happy-number/description/
 * */

public class No202 {

    public static boolean isHappyFS(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static boolean isHappy(int n) {

        Set<Integer> visited = new HashSet<>();

        while (n != 1) {

            int next = getNextNumber(n);

            if (visited.contains(next)) {
                return false;
            }

            visited.add(next);

            n = next;
        }

        return true;
    }

    private static int getNextNumber(int n) {

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += (lastDigit * lastDigit);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(isHappyFS(1));
        System.out.println(isHappyFS(19));
        System.out.println(isHappyFS(2));

    }

}
