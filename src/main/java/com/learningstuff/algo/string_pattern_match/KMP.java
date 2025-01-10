package com.learningstuff.algo.string_pattern_match;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/8/25
 * Email: mdshamim723@gmail.com
 */

public class KMP {

    public static void main(String[] args) {

        String text = "abxabcabcaby";
        String pattern = "abcaby";

        System.out.println(kmpSolution(text, pattern));

    }

    private static boolean kmpSolution(String text, String pattern) {

        int[] lps = createLPS(pattern);
        System.out.println(Arrays.toString(lps));

        return false;
    }

    private static int[] createLPS(String pattern) {

        int[] ans = new int[pattern.length()];

        ans[0] = 0;

        int matchIndex = 0;

        for (int i = 1; i < pattern.length(); i++) {

            if (pattern.charAt(matchIndex) == pattern.charAt(i)) {
                matchIndex++;
                ans[i] = matchIndex;
            } else {
                matchIndex = 0;
                ans[i] = matchIndex;
            }

        }

        return ans;
    }

}
