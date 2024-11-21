package com.learningstuff.recursion.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/11/24
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * */


public class No17 {

    static Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public static void solution(String s, int i, String cur) {

        if (i == s.length()) {
            System.out.println(cur);
            return;
        }

        String data = map.get(s.charAt(i));

        if (data == null) {
            solution(s, i + 1, cur);
            return;
        }

        for (int j = 0; j < data.length(); j++) {
            solution(s, i + 1, cur + data.charAt(j));
        }

    }


    public static List<String> solutionR(String s, int i, String cur) {

        if (i == s.length()) {
            List<String> l = new ArrayList<>();
            l.add(cur);
            return l;
        }

        String data = map.get(s.charAt(i));

        if (data == null) {
            return solutionR(s, i + 1, cur);
        }

        List<String> res = new ArrayList<>();

        for (int j = 0; j < data.length(); j++) {
            res.addAll(solutionR(s, i + 1, cur + data.charAt(j)));
        }

        return res;
    }

    public static int solutionCount(String s, int i) {

        if (i == s.length()) {
            return 1;
        }

        String data = map.get(s.charAt(i));

        if (data == null) {
            return solutionCount(s, i + 1);
        }

        int count = 0;

        for (int j = 0; j < data.length(); j++) {
            count += solutionCount(s, i + 1);
        }

        return count;
    }


    public static void main(String[] args) {

        solution("123", 0, "");
        System.out.println(solutionR("123", 0, ""));
        System.out.println(solutionCount("123", 0));

    }

}
