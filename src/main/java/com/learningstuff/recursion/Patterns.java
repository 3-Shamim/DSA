package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/27/24
 * Email: mdshamim723@gmail.com
 */

public class Patterns {

    static void starTriangle(int r, int c) {

        if (r == 0) {
            return;
        }

        if (r > c) {
            System.out.print("*");
            starTriangle(r, c + 1);
        } else {
            System.out.println();
            starTriangle(r - 1, 0);
        }

    }

    static void starTriangle2(int r, int c) {

        if (r == 0) {
            return;
        }

        if (r > c) {
            starTriangle2(r, c + 1);
            System.out.print("*");
        } else {
            starTriangle2(r - 1, 0);
            System.out.println();
        }

    }

    public static void main(String[] args) {

        starTriangle(4, 0);
        System.out.println();
        starTriangle2(3, 0);

    }

}
