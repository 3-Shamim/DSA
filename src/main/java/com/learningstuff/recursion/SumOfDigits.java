package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/9/24
 * Time: 8:50 AM
 * Email: mdshamim723@gmail.com
 */

public class SumOfDigits {

    static int sumOfDigits(int n) {

//        int last = n % 10;
//
//        if (last <= 0) {
//            return 0;
//        }

//        return last + sumOfDigits(n / 10);

        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(1342));

    }

}
