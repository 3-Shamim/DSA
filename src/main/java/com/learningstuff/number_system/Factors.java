package com.learningstuff.number_system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 25/9/24
 * Time: 10:45 PM
 * Email: mdshamim723@gmail.com
 */

public class Factors {

    public static void main(String[] args) {

        printFactors(40);

    }

    // Time O(sqrt(n)), Space O(sqrt(n))
    static void printFactors(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
                list.add(n / i);
            }

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

    }

    // Time O(sqrt(n)), Space O(1)
    static void printFactors3(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.print(i + " " + n / i + " ");
            }

        }

        System.out.println();

    }

    // Time O((n - 2) / 2) - O(n), Space O(1)
    static void printFactors2(int n) {

        System.out.print(1 + " ");

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println(n);

    }

    // Time O(n), Space O(1)
    static void printFactors1(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

    }

}
