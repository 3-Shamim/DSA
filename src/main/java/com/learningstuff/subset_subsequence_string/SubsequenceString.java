package com.learningstuff.subset_subsequence_string;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/3/24
 * Email: mdshamim723@gmail.com
 */

public class SubsequenceString {



    public static void main(String[] args) {

        subsequence("", "abc");
        subsequence("abc", 0, "");

    }

    private static void subsequence(String s, int i, String res) {

        if (i == s.length()) {
            System.out.println(res);
            return;
        }

        subsequence(s, i + 1, res + s.charAt(i));
        subsequence(s, i + 1, res);

    }

    private static void subsequence(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        subsequence(p + c, up.substring(1));
        subsequence(p, up.substring(1));

    }

}
