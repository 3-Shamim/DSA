package com.learningstuff.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 4/30/25
 * Email: mdshamim723@gmail.com
 */

public class GenerateParenthesis {

    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));

    }

    public static List<String> generateParenthesis(int n) {
        return helper(n, 1, 1, "");
    }

    private static List<String> helper(int n, int o, int c, String ans) {

        if (c > o) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();

        if (o <= n) {
            res.addAll(helper(n, o + 1, c, ans + "("));
        }

        if (c <= n) {
            res.addAll(helper(n, o, c + 1, ans + ")"));
        }

        if (o > n && c > n) {
            res.add(ans);
        }

        return res;
    }

//    private static void helper(int n, int o, int c, String ans) {
//
//        if (c > o) return;
//
//        if (o <= n) {
//            helper(n, o + 1, c, ans + "(");
//        }
//
//        if (c <= n) {
//            helper(n, o, c + 1, ans + ")");
//        }
//
//        if (o > n && c > n) {
//            System.out.println(ans);
//        }
//
//    }

}
