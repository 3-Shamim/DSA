package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/9/24
 * Time: 8:50 AM
 * Email: mdshamim723@gmail.com
 */

public class ProdOfDigits {

    static int prodOfDigits(int n) {

        if (n == 0) {
            return 1;
        }

        return (n % 10) * prodOfDigits(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(prodOfDigits(1342));
        System.out.println(prodOfDigits(405));

    }

}
