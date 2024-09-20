package com.learningstuff.number_system;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 20/9/24
 * Time: 8:37 AM
 * Email: mdshamim723@gmail.com
 */

public class PrimeNumber {

    static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        // n
        // n / 2
        // sqrt(n)
        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(13));
        System.out.println(isPrime(10));
        System.out.println(isPrime(36));

    }

}
