package com.learningstuff.algo.string_pattern_match;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/8/25
 * Email: mdshamim723@gmail.com
 */

public class KMP {

    public static void main(String[] args) {

        String pattern = "abcaby";
        String text = "abxabcabcaby";

        System.out.println(kmpSolution(text, pattern));

    }

    private static boolean kmpSolution(String text, String pattern) {

        int[] lps = createLPS(pattern);

        int tLen = text.length();
        int pLen = pattern.length();

        int tIndex = 0;
        int pIndex = 0;

        while (tIndex < tLen && pIndex < pLen) {

            if (text.charAt(tIndex) == pattern.charAt(pIndex)) {
                tIndex++;
                pIndex++;
            } else {
                if (pIndex == 0) {
                    tIndex++;
                } else {
                    pIndex = lps[pIndex - 1];
                }
            }

        }

        return pIndex == pLen;
    }

    // Test Data
    // ababcababa = 0012012343
    // abcabcda = 00012301
    // abab = 0012
    private static int[] createLPS(String pattern) {

        int[] lps = new int[pattern.length()];

        lps[0] = 0;

        int len = 0;

        for (int i = 1; i < pattern.length(); i++) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                } else {
                    i--;
                    len = lps[len - 1];
                }
            }

        }

        return lps;
    }

}
