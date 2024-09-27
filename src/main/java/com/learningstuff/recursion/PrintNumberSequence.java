package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/9/24
 * Time: 8:31 AM
 * Email: mdshamim723@gmail.com
 */

public class PrintNumberSequence {

    static void printNumberSequenceB(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumberSequenceB(n - 1);

        System.out.print(" " + n);


    }

    static void printNumberSequenceR(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumberSequenceR(n - 1);
    }

    static void printNumberSequence(int n) {

        if (n == 0) {
            return;
        }

        printNumberSequence(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        printNumberSequence(5);
        System.out.println();
        printNumberSequenceR(5);
        System.out.println();
        printNumberSequenceB(5);

    }

}
