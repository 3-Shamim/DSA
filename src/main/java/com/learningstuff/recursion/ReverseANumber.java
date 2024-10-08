package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 28/9/24
 * Time: 2:13 PM
 * Email: mdshamim723@gmail.com
 */

public class ReverseANumber {

    static int ans = 0;

    static void reverseNumber(int n) {

        if (n == 0) {
            return;
        }

        ans = (ans * 10) + (n % 10);

        reverseNumber(n / 10);

    }

    static int reverseNumber(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        return reverseNumber(n / 10, (rev * 10) + (n % 10));
    }

    static int reverseNumber1(int n) {

        int digits = (int) Math.log10(n);

        return helper(n, digits);
    }

    private static int helper(int n, int digits) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) * (int) Math.pow(10, digits) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {

        reverseNumber(1234);
        System.out.println(ans);

        System.out.println(reverseNumber(1, 0));
        System.out.println(reverseNumber(1234, 0));

        System.out.println(reverseNumber1(1234));

    }

}
