package com.learningstuff.recursion.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/15/24
 * Email: mdshamim723@gmail.com
 */

public class NumOfDiceRollsWithTargetSum {

    static void diceRolls(int[] nums, int target, int sum, List<Integer> ans) {

        if (sum == target) {
            System.out.println(ans);
            return;
        }

        for (int num : nums) {

            int newSum = num + sum;

            if (newSum > target) {
                break;
            }

            List<Integer> newAns = new ArrayList<>(ans);
            newAns.add(num);

            diceRolls(nums, target, newSum, newAns);

        }

    }

    static void diceRolls(int[] nums, int target, List<Integer> ans) {

        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int num : nums) {

            int newTarget = target - num;

            if (newTarget < 0) {
                break;
            }

            List<Integer> newAns = new ArrayList<>(ans);
            newAns.add(num);

            diceRolls(nums, newTarget, newAns);

        }

    }

    static List<List<Integer>> diceRollsRet(int[] nums, int target, List<Integer> ans) {

        if (target == 0) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int num : nums) {

            int newTarget = target - num;

            if (newTarget < 0) {
                break;
            }

            List<Integer> newAns = new ArrayList<>(ans);
            newAns.add(num);

            res.addAll(diceRollsRet(nums, newTarget, newAns));

        }

        return res;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        diceRolls(nums, 4, 0, new ArrayList<>());
        diceRolls(nums, 4, new ArrayList<>());
        System.out.println(diceRollsRet(nums, 4, new ArrayList<>()));


    }

}
