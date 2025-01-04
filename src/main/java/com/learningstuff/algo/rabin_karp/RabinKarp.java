package com.learningstuff.algo.rabin_karp;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/4/25
 * Email: mdshamim723@gmail.com
 */

public class RabinKarp {

    public static void main(String[] args) {

        String pattern = "abcd";

        String text = "sdfefabcabcccabcdad";

        boolean exist = search(text, pattern);

        System.out.println(exist);

    }

    private static boolean search(String text, String pattern) {

        long patternHash = createHash(pattern);

        int left = 0;
        int hash = 0;

        for (int i = 0; i < text.length(); i++) {

            int hashNum = getInt(text, i);

            if (i >= pattern.length()) {

                if (hash == patternHash && checkActualText(pattern, text, left, i)) {
                    return true;
                }

                int leftHashNum = getInt(text, left);

                hash -= leftHashNum;
                hash += hashNum;

                left++;

            } else {
                hash += hashNum;
            }

        }

        return false;
    }

    private static boolean checkActualText(String pattern, String text, int left, int right) {
        return pattern.equals(text.substring(left, right));
    }

    private static long createHash(String text) {

        long hash = 0;

        for (int i = 0; i < text.length(); i++) {
            hash += getInt(text, i);
        }

        return hash;
    }

    private static int getInt(String text, int i) {
        return text.charAt(i) - 'a' + 1;
    }

}
