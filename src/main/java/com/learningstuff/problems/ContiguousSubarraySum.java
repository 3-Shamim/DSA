package com.learningstuff.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/3/25
 * Email: mdshamim723@gmail.com
 */

public class ContiguousSubarraySum {

    private static final int MIN_GOOD_SUBARRAY_LIMIT = 2;

    /* Todo:
    *   Try to understand the logic
    * */
    public boolean hasGoodSubarray(int[] nums, int k) {
        if (nums == null) {
            return false;
        }

        long sumSoFar = 0;
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {

            sumSoFar += nums[currentIndex];
            Integer firstIndex = remainderIndexMap.get((int) (sumSoFar % k));

            if (firstIndex == null) {
                remainderIndexMap.put((int) (sumSoFar % k), currentIndex);
            } else if (currentIndex - firstIndex >= MIN_GOOD_SUBARRAY_LIMIT) {
                return true;
            }

        }

        return false;
    }

    public boolean hasGoodSubarray1(int[] nums, int k) {

        return calculateGoodSubarray(nums, 0, new ArrayList<>(), k);
    }

    private boolean calculateGoodSubarray(int[] nums, int i, List<Integer> res, int k) {

        if (i == nums.length) {

            int sum = res.stream().mapToInt(Integer::intValue).sum();
            return res.size() > 1 && (sum % k) == 0;
        }

        int num = nums[i];

        boolean helper = calculateGoodSubarray(nums, i + 1, res, k);

        if (helper) {
            return true;
        }

        List<Integer> newRes = new ArrayList<>(res);
        newRes.add(num);

        return calculateGoodSubarray(nums, i + 1, newRes, k);
    }

    public static void main(String[] args) {
        // debug your code below
        ContiguousSubarraySum solution = new ContiguousSubarraySum();
        int[] nums = {23, 2, 4, 7};
        int k = 6;
        boolean result = solution.hasGoodSubarray(nums, k);
        System.out.println("Result: " + result);

    }

}
