package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 7/9/24
 * Time: 3:56 PM
 * Email: mdshamim723@gmail.com
 */

public class HelloWorld {

    // Print 'Hello World' n times without using any built-in loop/iterator
    static void printHelloWorld(int n) {

        // Base condition / breaking point
        if (n == 0) {
            return;
        }

        printHelloWorld(n - 1);
        System.out.println(n);

    }


    public static void main(String[] args) {
        printHelloWorld(5);
    }

}
