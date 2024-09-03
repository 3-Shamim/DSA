package com.learningstuff.patterns;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/9/24
 * Time: 8:34 PM
 * Email: mdshamim723@gmail.com
 */

public class Pattern1 {

    public static void main(String[] args) {

        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern6_1(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern7_1(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);

    }

    private static void pattern13(int n) {

        int colLen = (n * 2) - 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < colLen; j++) {

                if (j >= i && j < (colLen - i)) {

                    if (i % 2 == 0 && j % 2 == 0) {
                        System.out.print("*");
                        continue;
                    }

                    if (i % 2 != 0 && j % 2 != 0) {
                        System.out.print("*");
                        continue;
                    }

                }

                System.out.print(" ");

            }

            System.out.println();

        }

    }

    private static void pattern12(int n) {

        int colLen = (n * 2) - 1;

        for (int i = 0; i < n; i++) {

            int l = (colLen / 2) - i;
            int r = (colLen / 2) + i;

            for (int j = 0; j < colLen; j++) {

                if (j >= l && j <= r) {

                    if (i % 2 == 0 && j % 2 == 0) {
                        System.out.print("*");
                        continue;
                    }

                    if (i % 2 != 0 && j % 2 != 0) {
                        System.out.print("*");
                        continue;
                    }

                }

                System.out.print(" ");

            }

            System.out.println();

        }

    }


    private static void pattern11(int n) {

        int totalCol = ((n * 2) - 1);

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= totalCol; j++) {

                if (j > i && j <= (totalCol - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

    private static void pattern10(int n) {

        int totalCol = ((n * 2) - 1);

        for (int i = 0; i < n; i++) {

            int l = (totalCol / 2) - i;
            int r = (totalCol / 2) + i;

            for (int j = 0; j < totalCol; j++) {

                if (j >= l && j <= r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

    private static void pattern9(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

    }

    private static void pattern8(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j <= (n - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

    }

    private static void pattern7_1(int n) {

        for (int i = 1; i <= ((n * 2) - 1); i++) {

            int col = i;

            if (i > n) {
                col = (n * 2) - i;
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }

    private static void pattern7(int n) {
        pattern4(n);
        pattern5(n - 1);
    }

    private static void pattern6_1(int n) {

        for (int i = 1; i <= ((n * 2) - 1); i++) {

            int col = i;

            if (i > n) {
                col = n - (i % n);
            }

            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    private static void pattern6(int n) {
        pattern2(n);
        pattern3(n - 1);
    }

    private static void pattern5(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }

    private static void pattern4(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }

    private static void pattern3(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    private static void pattern2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    private static void pattern1(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

}
