package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 16/9/24
 * Time: 9:55 PM
 * Email: mdshamim723@gmail.com
 */

public class OddEven {

    public static void main(String[] args) {

        checkOddOrEven(1);
        checkOddOrEven(5);
        checkOddOrEven(6);

    }

    private static void checkOddOrEven(int i) {

        // In binary if the last digit is 1 then the whole number is odd
        // In binary last digit represent the odd/even state
        // Last digit is called: LSB: least significant bit
        int remainder = i & 1;

        if (remainder == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    // using mod
    private static void checkOddOrEvenByMod(int i) {

        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
