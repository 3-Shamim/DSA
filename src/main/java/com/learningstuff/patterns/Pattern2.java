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
        pattern3(10);
        System.out.println();

    }

    private static void pattern3(int n) {

        int len = n % 2 == 0 ? n - 1 : n;
        int mid = len / 2;

        for (int i = 0; i < len; i++) {

            int s = Math.abs(mid - i);
            int c = (i + (i + 1));

            if (i > mid) {
                c = (len - (s * 2));
            }

            for (int j = 0; j < len; j++) {

                if (j >= s && j < (s + c)) {

                    if (j % 2 == 0 && i % 2 == 0) {
                        System.out.print("*");
                        continue;
                    }

                    if (j % 2 != 0 && i % 2 != 0) {
                        System.out.print("*");
                        continue;
                    }

                }

                System.out.print(" ");

            }

            System.out.println();

        }

    }

    private static void pattern2(int n) {

        int mid = n / 2;
        int gapCount = 0;

        for (int i = 0; i < n; i++) {

            if (i < mid) {
                gapCount = 2 * i;
            } else if (i != mid) {
                gapCount -= 2;
            }

            int startPoint = mid - (gapCount / 2);

            for (int j = 0; j < n; j++) {

                if (j >= startPoint && j < (startPoint + gapCount)) {
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
