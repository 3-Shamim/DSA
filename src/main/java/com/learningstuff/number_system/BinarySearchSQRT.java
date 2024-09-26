package com.learningstuff.number_system;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 25/9/24
 * Time: 9:09 PM
 * Email: mdshamim723@gmail.com
 */

public class BinarySearchSQRT {

    public static void main(String[] args) {

        System.out.println(sqrt(40, 3));
        System.out.println(sqrt(36, 2));

    }

    static double sqrt(int n, int p) {

        int s = 0, e = n;

        double root = 0.0;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            } else if (n > m * m) {
                s = m + 1;
            } else {
                e = m - 1;
            }

        }

        root += e;

        double increment = 0.1;

        for (int i = 0; i < p; i++) {

            while (root * root <= n) {
                root += increment;
            }

            root -= increment;

            increment /= 10;

        }

        return root;
    }

}
