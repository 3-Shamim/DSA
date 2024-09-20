package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 19/9/24
 * Time: 9:19 AM
 * Email: mdshamim723@gmail.com
 */

public class FindTheNumberOfSetBit {

    static int findNumberOfSetBit(int n) {

        int ans = 0;

        while (n > 0) {

            n = n & (n - 1);
            ans++;

        }

        return ans;
    }

    static int findNumberOfSetBitL(int n) {

        int ans = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                ans++;
            }

            n >>= 1;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findNumberOfSetBit(9));
        System.out.println(findNumberOfSetBit(7));

    }

}
