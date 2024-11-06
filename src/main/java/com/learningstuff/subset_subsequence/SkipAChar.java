package com.learningstuff.subset_subsequence;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/3/24
 * Email: mdshamim723@gmail.com
 */

public class SkipAChar {

    static String skipAChar(String s, char c) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != c) {
                builder.append(s.charAt(i));
            }

        }

        return builder.toString();
    }

    static String skipACharWithRecursion(String s, char c, int i) {

        if (i == s.length()) {
            return "";
        }

        String a = skipACharWithRecursion(s, c, i + 1);

        String c1 = "";

        if (s.charAt(i) != c) {
            c1 += s.charAt(i);
        }

        return c1 + a;
    }

    static String skipACharWithRecursion(String s, char c, int i, String res) {

        if (i == s.length()) {
            return res;
        }

        if (s.charAt(i) != c) {
            res += s.charAt(i);
        }

        return skipACharWithRecursion(s, c, i + 1, res);
    }

    static String skipString(String s, String skip) {

        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith(skip)) {
            return skipString(s.substring(skip.length()), skip);
        }

        return s.charAt(0) + skipString(s.substring(1), skip);

    }

    public static void main(String[] args) {

        System.out.println(skipAChar("baccad", 'a'));
        System.out.println(skipACharWithRecursion("baccad", 'a', 0));
        System.out.println(skipACharWithRecursion("baccad", 'a', 0, ""));
        System.out.println(skipString("baccad", "a"));

    }

}
