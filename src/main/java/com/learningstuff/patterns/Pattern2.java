package com.learningstuff.patterns;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/9/24
 * Time: 8:34 PM
 * Email: mdshamim723@gmail.com
 */

public class Pattern2 {

    public static void main(String[] args) {

        pattern1(10);
        System.out.println();
        pattern2(10);
        System.out.println();

    }

    private static void pattern2(int n) {

        for (int i = 0; i < n / 2; i++) {

            int p = (n / 2) - i;

            for (int j = 0; j < n; j++) {

                if (i > 0 && (j >= p && j < (p + (i * 2)))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

    }

    private static void pattern1(int n) {

        for (int i = 0; i < n / 2; i++) {

            int p = (n / 2) - i;

            for (int j = 0; j < n; j++) {

                if (i > 0 && (j >= p && j < (p + (i * 2)))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

        for (int i = (n / 2 - 1); i >= 0; i--) {

            int p = (n / 2) - i;

            for (int j = 0; j < n; j++) {

                if (i > 0 && (j >= p && j < (p + (i * 2)))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

    }

}
