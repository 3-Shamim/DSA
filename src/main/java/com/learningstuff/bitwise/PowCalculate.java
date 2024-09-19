package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 8:47 AM
 * Email: mdshamim723@gmail.com
 */

public class PowCalculate {


    // Binary approach, Time O(log(n)), Space O(1)
    static int pow(int a, int b) {

        int ans = 1;

        while (b > 0) {

            int last = b & 1; // Get last digit from binary form
            b = b >> 1; // remove last digit


            if (last == 1) {
                ans *= a;
            }

            a *= a;

        }

        return ans;
    }


    // Linear approach, Time O(n), Space O(1)
    static int powL(int a, int b) {

        int ans = 1;

        for (int i = 0; i < b; i++) {

            ans *= a;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(pow(5, 3));
        System.out.println(pow(2, 3));
        System.out.println(pow(3, 6));

    }

}
