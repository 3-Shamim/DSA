package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 7:54 AM
 * Email: mdshamim723@gmail.com
 */

public class MagicNumber {

    static int magicNumber(int n) {

        int ans = 0;
        int base = 5;

        while (n > 0) {

            int last = n & 1;

            n = n >> 1;

            ans += base * last;

            base = base * 5;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(magicNumber(1));
        System.out.println(magicNumber(2));
        System.out.println(magicNumber(3));

    }

}
