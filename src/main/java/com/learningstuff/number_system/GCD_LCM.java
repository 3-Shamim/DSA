package com.learningstuff.number_system;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 26/9/24
 * Time: 9:22 AM
 * Email: mdshamim723@gmail.com
 */

public class GCD_LCM {

    static int lcm1(int a, int b) {

        if (a > b) {

            if (a % b == 0) {
                return a;
            }

        } else {

            if (b % a == 0) {
                return b;
            }

        }

        return a * b;
    }

    static int gcd1(int a, int b) {
        return a * b / lcm1(a, b);
    }

    static int lcm(int a, int b) {

        return a * b / gcd(a, b);
    }

    static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    public static void main(String[] args) {

        System.out.println(gcd(4, 9));
        System.out.println(gcd1(4, 9));
        System.out.println();
        System.out.println(lcm(4, 9));
        System.out.println(lcm1(4, 9));
        System.out.println();
        System.out.println(gcd(9, 18));
        System.out.println(gcd1(9, 18));
        System.out.println();
        System.out.println(lcm(9, 18));
        System.out.println(lcm1(9, 18));
        System.out.println();
        System.out.println(gcd(3, 4));
        System.out.println(gcd1(3, 4));
        System.out.println();
        System.out.println(lcm(3, 4));
        System.out.println(lcm1(3, 4));

    }

}
