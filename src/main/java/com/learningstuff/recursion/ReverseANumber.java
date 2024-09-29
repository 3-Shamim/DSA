package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 28/9/24
 * Time: 2:13 PM
 * Email: mdshamim723@gmail.com
 */

public class ReverseANumber {

    static int reverseNumber(int n) {

        if (n == 0) {
            return 0;
        }

        return reverseNumber(n / 10) * 10 + (n % 10);
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(2431));

    }

}
