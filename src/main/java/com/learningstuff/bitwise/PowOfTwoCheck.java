package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 8:04 AM
 * Email: mdshamim723@gmail.com
 */

public class PowOfTwoCheck {

    static boolean isPowOfTwo(int n) {

        if (n <= 0) return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        System.out.println(isPowOfTwo(0));
        System.out.println(isPowOfTwo(32));
        System.out.println(isPowOfTwo(33));

    }

}
