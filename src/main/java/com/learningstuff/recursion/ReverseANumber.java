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

    public static void main(String[] args) {

        reverseNumber(1234);
        System.out.println(ans);

        int ans1 = 0;
        ans1 = reverseNumber(1234, ans1);
        System.out.println(ans1);

    }

}
