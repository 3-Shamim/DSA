package com.learningstuff.subset_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/5/24
 * Email: mdshamim723@gmail.com
 */

public class SubsequenceArray {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        subsequence(list, 0, new ArrayList<>());

        List<List<Integer>> seq1 = new ArrayList<>();
        subsequenceR(list, 0, new ArrayList<>(), seq1);
        System.out.println(seq1);

        List<List<Integer>> seq2 = subsequenceR(list, 0, new ArrayList<>());
        System.out.println(seq2);

        List<List<Integer>> seq3 = new ArrayList<>();
        seq3.add(new ArrayList<>());

        for (Integer integer : list) {

            for (int i = 0; i < seq3.size(); i++) {

                List<Integer> integers = seq3.get(i);
                seq3.add(new ArrayList<>(integers));
                integers.add(integer);

            }

        }

        System.out.println(seq3);

    }

    private static void subsequence(List<Integer> list, int i, ArrayList<Integer> res) {

        if (i == list.size()) {
            System.out.println(res);
            return;
        }

        Integer c = list.get(i);

        // exclude
        subsequence(list, i + 1, new ArrayList<>(res));

        // include
        ArrayList<Integer> include = new ArrayList<>(res);
        include.add(c);
        subsequence(list, i + 1, include);

    }

    private static void subsequenceR(List<Integer> list, int i, List<Integer> cur, List<List<Integer>> res) {

        if (i == list.size()) {
            res.add(cur);
            return;
        }

        Integer c = list.get(i);

        // exclude
        subsequenceR(list, i + 1, new ArrayList<>(cur), res);

        // include
        ArrayList<Integer> include = new ArrayList<>(cur);
        include.add(c);
        subsequenceR(list, i + 1, include, res);

    }

    private static List<List<Integer>> subsequenceR(List<Integer> list, int i, List<Integer> cur) {

        if (i == list.size()) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(cur);
            return res;
        }

        Integer c = list.get(i);

        // exclude
        List<List<Integer>> left = subsequenceR(list, i + 1, new ArrayList<>(cur));

        // include
        ArrayList<Integer> include = new ArrayList<>(cur);
        include.add(c);
        List<List<Integer>> right = subsequenceR(list, i + 1, include);

        left.addAll(right);

        return left;
    }

}
