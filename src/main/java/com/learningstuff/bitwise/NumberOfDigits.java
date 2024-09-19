package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 8:01 AM
 * Email: mdshamim723@gmail.com
 */

public class NumberOfDigits {

    static int numberOfDigits(int n, int base) {

        return (int) (Math.log(n) / Math.log(base)) + 1;
    }

    public static void main(String[] args) {

        System.out.println(numberOfDigits(123213, 10));
        System.out.println(numberOfDigits(4, 2));

    }

}
