package com.learningstuff.algo.rabin_karp;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/4/25
 * Email: mdshamim723@gmail.com
 */

public class RabinKarp {

    private static final long PRIME_NUMBER = 5381;
    private static final long TOTAL_ALPHABETS = 26;

    public static void main(String[] args) {

        String pattern = "abc";

        String text = "aabc";

        boolean exist = searchWithSimpleHash(text, pattern);

        System.out.println(exist);

        boolean exist1 = searchWithRabinKarpHash(text, pattern);

        System.out.println(exist1);

    }

    private static boolean searchWithRabinKarpHash(String text, String pattern) {

        long patternHash = createRabinKarpHash(pattern);

        int patternLen = pattern.length() - 1;

        int left = 0;
        long hash = 0;

        for (int i = 0; i < text.length(); i++) {

            int pow = i <= patternLen ? patternLen - i : 0;

            int v = getInt(text, i);
            hash += (v * (long) Math.pow(TOTAL_ALPHABETS, pow)) % PRIME_NUMBER;

            if (patternHash == hash && checkActualText(pattern, text, left, i + 1)) {
                return true;
            }

            if (i >= patternLen) {

                int leftV = getInt(text, left);
                hash -= (leftV * (long) Math.pow(TOTAL_ALPHABETS, patternLen)) % PRIME_NUMBER;
                hash *= TOTAL_ALPHABETS;

                left++;

            }

        }

        return false;
    }

    private static long createRabinKarpHash(String pattern) {

        long hash = 0;
        int len = pattern.length() - 1;

        for (int i = 0; i < pattern.length(); i++) {

            int v = getInt(pattern, i);
            hash += (v * (long) Math.pow(TOTAL_ALPHABETS, len - i)) % PRIME_NUMBER;

        }

        return hash;
    }

    private static boolean searchWithSimpleHash(String text, String pattern) {

        long patternHash = createSimpleHash(pattern);

        int left = 0;
        long hash = 0;

        for (int i = 0; i < text.length(); i++) {

            int hashNum = getInt(text, i);

            hash += hashNum;

            if (hash == patternHash && checkActualText(pattern, text, left, i + 1)) {
                return true;
            }

            if ((i + 1) >= pattern.length()) {
                long leftHashNum = getInt(text, left);
                hash -= leftHashNum;
                left++;
            }

        }

        return false;
    }

    private static boolean checkActualText(String pattern, String text, int left, int right) {
        System.out.println(left + " " + right + " " + text.substring(left, right));
        return pattern.equals(text.substring(left, right));
    }

    private static long createSimpleHash(String text) {

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
