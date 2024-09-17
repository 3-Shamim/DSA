package com.learningstuff.bitwise;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 17/9/24
 * Time: 8:31 AM
 * Email: mdshamim723@gmail.com
 */

public class BitOperation {


    static int resetIthBit(int n, int i) {

        // find the bit mask for ith bit
        int bitNum = 1 << (i - 1);

        // ~ is complement that makes the bit opposite
        int opposite = ~bitNum;
        return n & opposite;
    }

    static int setIthBit(int n, int i) {

        int bitNum = 1 << (i - 1);

        return n | bitNum;
    }

    static int findIthBit(int n, int i) {

        // It will give you the Ith bit's decimal number

//        int bitNum = (int) Math.pow(2, i - 1);
        int bitNum = 1 << (i - 1);

        return n & bitNum;
    }

    public static void main(String[] args) {

        System.out.println(findIthBit(17, 5));
        System.out.println(findIthBit(17, 4));
        System.out.println(setIthBit(17, 5));
        System.out.println(setIthBit(17, 4));
        System.out.println(resetIthBit(17, 5));
        System.out.println(resetIthBit(17, 4));

    }

}
