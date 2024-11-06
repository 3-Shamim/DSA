package com.learningstuff.subset_subsequence;

import java.util.ArrayList;
import java.util.List;

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

        List<String> seq = subsequenceAsList("abc", 0, "");
        System.out.println(seq);

        List<String> seq1 = new ArrayList<>();
        subsequenceAsList("abc", 0, "", seq1);
        System.out.println(seq1);

    }

    private static void subsequenceAsList(String s, int i, String current, List<String> seq) {

        if (i == s.length()) {
            seq.add(current);
            return;
        }

        subsequenceAsList(s, i + 1, current + s.charAt(i), seq);
        subsequenceAsList(s, i + 1, current, seq);

    }

    private static List<String> subsequenceAsList(String s, int i, String current) {

        if (i == s.length()) {
            List<String> seq = new ArrayList<>();
            seq.add(current);
            return seq;
        }

        List<String> left = subsequenceAsList(s, i + 1, current + s.charAt(i));
        List<String> right = subsequenceAsList(s, i + 1, current);

        left.addAll(right);

        return left;
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
