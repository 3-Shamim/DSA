package com.learningstuff.permutation;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/9/24
 * Email: mdshamim723@gmail.com
 */

public class Permutation {

    public static void main(String[] args) {
        permutation("", "abc");
    }

    private static void permutation(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String l = p.substring(0, i);
            String r = p.substring(i);

            permutation(l + c + r, up.substring(1));
        }

    }

}
