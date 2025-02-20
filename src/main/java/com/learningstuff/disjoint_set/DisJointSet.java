package com.learningstuff.disjoint_set;

import com.learningstuff.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/19/25
 * Email: mdshamim723@gmail.com
 */

public class DisJointSet {

    public static void main(String[] args) {

        List<Pair<Integer, Integer>> sets = new ArrayList<>();
        sets.add(new Pair<>(0, 1));
        sets.add(new Pair<>(0, 3));
        sets.add(new Pair<>(2, 3));
        sets.add(new Pair<>(1, 2));

        int[] parent = new int[4];
        Arrays.fill(parent, -1);

        for (Pair<Integer, Integer> set : sets) {

            int from = findAbsoluteParent(parent, set.getFirst());
            int to = findAbsoluteParent(parent, set.getSecond());

            System.out.println(from + " " + to);



        }


    }

    private static int findAbsoluteParent(int[] parent, int v) {

        int p = parent[v];

        if (p == -1) {
            return v;
        }

        return findAbsoluteParent(parent, p);
    }

}
