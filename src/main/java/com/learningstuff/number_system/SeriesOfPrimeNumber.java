package com.learningstuff.number_system;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/9/24
 * Time: 10:47 PM
 * Email: mdshamim723@gmail.com
 */

public class SeriesOfPrimeNumber {

    public static void main(String[] args) {

        int n = 40;

//        System.out.println(Math.sqrt(n));

        // false in array means number is prime
        boolean[] store = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {

            if (!store[i]) {

                for (int j = i * 2; j <= n; j += i) {
                    System.out.println(j);
                    store[j] = true;
                }

            }

        }

        for (int i = 2; i < store.length; i++) {
            if (!store[i]) {
                System.out.print(i + " ");
            }
        }

    }

}
