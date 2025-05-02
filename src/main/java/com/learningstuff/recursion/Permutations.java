package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 5/1/25
 * Email: mdshamim723@gmail.com
 */

public class Permutations {

    public static void main(String[] args) {

        String s = "ABC";

        permutations(s, "");

    }

    private static void permutations(String s, String ans) {

        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutations(remaining, ans + current);

        }

    }

}
