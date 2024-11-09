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

public class SubsequenceDuplicateArray {

    public static void main(String[] args) {

        int[] nums = {2, 1, 2};
        Arrays.sort(nums);

        subsequence(nums, 0, new ArrayList<>());

        System.out.println(subsequenceR(nums, 0, new ArrayList<>()));

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : nums) {

            int size = res.size();

            for (int j = 0; j < size; j++) {

                List<Integer> curr = res.get(j);

                if (curr.isEmpty() || curr.get(curr.size() - 1) != num) {
                    res.add(new ArrayList<>(curr));
                }

                curr.add(num);

            }

        }

        System.out.println(res);

    }

    private static void subsequence(int[] nums, int i, List<Integer> curr) {

        if (nums.length == i) {
            System.out.println(curr);
            return;
        }

        if (curr.isEmpty() || curr.get(curr.size() - 1) != nums[i]) {
            subsequence(nums, i + 1, new ArrayList<>(curr));
        }

        curr.add(nums[i]);

        subsequence(nums, i + 1, curr);

    }

    private static List<List<Integer>> subsequenceR(int[] nums, int i, List<Integer> curr) {

        if (nums.length == i) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(curr);
            return res;
        }

        List<List<Integer>> res = new ArrayList<>();

        if (curr.isEmpty() || curr.get(curr.size() - 1) != nums[i]) {
            res.addAll(subsequenceR(nums, i + 1, new ArrayList<>(curr)));
        }

        curr.add(nums[i]);

        res.addAll(subsequenceR(nums, i + 1, curr));

        return res;
    }

}
