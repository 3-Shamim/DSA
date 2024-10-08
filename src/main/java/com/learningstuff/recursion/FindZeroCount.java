package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/8/24
 * Time: 10:03 PM
 * Email: mdshamim723@gmail.com
 */

public class FindZeroCount {

    static int findZero(int n) {

        if (n == 0) {
            return 1;
        }

        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int last = n % 10;

        return helper(n / 10, last == 0 ? count + 1 : count);
    }

    public static void main(String[] args) {

        System.out.println(findZero(0));
        System.out.println(findZero(10));
        System.out.println(findZero(1000));

    }

}
