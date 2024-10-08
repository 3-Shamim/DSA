package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/8/24
 * Time: 10:00 PM
 * Email: mdshamim723@gmail.com
 */

public class Palindrome {

    static boolean isPalindrome(int n) {

        return n == getRev(n, 0);
    }

    private static int getRev(int n, int base) {

        if (n == 0) {
            return base;
        }

        return getRev(n / 10, base * 10 + (n % 10));
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(123));

    }

}
