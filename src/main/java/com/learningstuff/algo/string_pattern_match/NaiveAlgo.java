package com.learningstuff.algo.string_pattern_match;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/8/25
 * Email: mdshamim723@gmail.com
 */

public class NaiveAlgo {

    public static void main(String[] args) {

        String pattern = "ab";
        String text = "agevabas";

        System.out.println(naiveAlgo(text, pattern));

    }

    private static boolean naiveAlgo(String text, String pattern) {

        for (int i = 0; i < text.length() - pattern.length(); i++) {

            boolean match = false;

            for (int j = 0; j < pattern.length(); j++) {

                if (text.charAt(i + j) == pattern.charAt(j)) {
                    match = true;
                } else {
                    match = false;
                    break;
                }

            }

            if (match) {
                return true;
            }

        }

        return false;
    }

}
