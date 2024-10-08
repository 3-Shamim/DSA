package com.learningstuff.recursion.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/8/24
 * Email: mdshamim723@gmail.com
 */

public class No1342 {

    public static int numberOfStepsW(int num) {

        int steps = 0;

        while (num > 0) {

            steps++;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

        }

        return steps;
    }

    public static int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        }

        return 1 + numberOfSteps(num % 2 == 0 ? num / 2 : num - 1);
    }

    public static void main(String[] args) {

        System.out.println(numberOfSteps(0));
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));

    }

}
