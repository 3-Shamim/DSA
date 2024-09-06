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
        pattern3_1(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern5_1(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern6_1(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(4);
        System.out.println();

    }

    private static void pattern10(int n) {

        int len = (2 * n) - 1;

        for (int row = 0; row < len; row++) {

            int num = row >= n ? row - n + 2  : n - row;

            for (int i = 0; i < len; i++) {

                int match = i >= n ? len - i - 1 : i;

//                System.out.print(match);

                if (match <= row) {
                    System.out.print(num + match);
                } else {
                    System.out.print(num);
                }

            }

            System.out.println();

        }

    }

    private static void pattern9(int n) {

        int len = 2 * n;

        for (int row = 1; row <= len ; row++) {

            int cols = Math.abs(len - (row * 2));
            int star = (len - cols) / 2;

            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }

            for (int i = 0; i < cols; i ++) {
                System.out.print(" ");
            }

            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    private static void pattern8(int n) {

        int len = 2 * n;

        for (int row = 1; row <= len ; row++) {

            int cols = row > n ? len - row : row;
            int spaces = n - cols;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int col = cols;  col > 0; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= cols; col++) {
                System.out.print(col + " ");
            }

            System.out.println();

        }

    }

   private static void pattern7(int n) {

        int len = 2 * n;

        for (int row = 0; row < len ; row++) {

            int cols = row * 2;

            if (row >= n) {
                cols = (len - row - 1) * 2;
            }

            int star = len - cols;

            for (int i = 0; i < star / 2; i++) {
                System.out.print("*");
            }

            for (int col = 0; col < cols; col++) {
                System.out.print(" ");
            }

            for (int i = 0; i < star / 2; i++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    private static void pattern6_1(int n) {

        pattern5_1(n);
        pattern6(n);

    }

    private static void pattern6(int n) {

        int len = n * 2;

        for (int row = n - 1; row > 0; row --) {

            int spaces = (len / 2) - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for(int i = row; i > 0; i--) {
                System.out.print(i + " ");
            }

            for (int i = 2; i <= row; i++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }

    }

    private static void pattern5_1(int n) {

        int len = n * 2;

        for (int row = 1; row <= n; row++) {

            int spaces = (len / 2) - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for(int i = row; i > 0; i--) {
                System.out.print(i + " ");
            }

            for (int i = 2; i <= row; i++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }

    }

    private static void pattern5(int n) {

        int len = n * 2;

        for (int row = 1; row <= n; row++) {

            int cols = (row * 2) - 1;

            int spaces = (len / 2) - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 0; col < cols; col++) {

                if (col < row) {
                    System.out.print((row - col) + " ");
                } else {
                    System.out.print(Math.abs((row - col) - 2) + " ");
                }

            }

            System.out.println();

        }

    }

    private static void pattern4(int n) {

        int len = n * 2;

        for (int row = 0; row < len; row++) {

            int cols = row > n ? len - row : row;

            for (int col = 0; col < cols; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    private static void pattern3_1(int n) {

        int len = n * 2;

        for (int row = 0; row < len; row++) {

            int cols = row > n ? len - row : row;

            int noOfSpaces = n - cols;

            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < cols; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

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
