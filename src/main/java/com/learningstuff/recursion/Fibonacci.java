package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 7/9/24
 * Time: 5:00 PM
 * Email: mdshamim723@gmail.com
 */

public class Fibonacci {

    // Print nth fibonacci number
    // Very inefficient solution, it will calculate every single steps
    // We can use DP for more efficiency
    static long fibonacci(long n) {

        if (n <= 1) {
            return n;
        }

//        long a = fibonacci(n - 1);
//        long b = fibonacci(n - 2);
//        return a + b;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Formula: (((1 + sqrt(5)) / 2) ^ n - ((1 - sqrt(5)) / 2) ^ n) / sqrt(5)
    static long fibonacciFormula(long n) {

        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {

//        System.out.println(fibonacci(50));
        System.out.println(fibonacci(5));
        System.out.println(fibonacciFormula(5));

    }

}
