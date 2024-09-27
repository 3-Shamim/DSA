package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/9/24
 * Time: 8:44 AM
 * Email: mdshamim723@gmail.com
 */

public class Factorial {

    static int factorial(int n) {

        if (n == 1) {
            return n;
        }

        return n * factorial((n - 1));
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

}
