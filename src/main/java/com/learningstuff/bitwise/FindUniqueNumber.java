package com.learningstuff.bitwise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 16/9/24
 * Time: 11:00 PM
 * Email: mdshamim723@gmail.com
 */

public class FindUniqueNumber {

    // Using bitwise: Time O(n), Space O(1)
    static int findUniqueNumber(int[] nums) {

        int unique = 0;

        for (int num: nums) {

            unique ^= num;

        }

        return unique;
    }

    // Using store loop: Time O(n), Space O(n)
    static int findUniqueNumberHM(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {

            if (map.get(key) == 1) {
                return key;
            }

        }

        return -1;
    }

    // Using sorting: Time O(nlog(n)), Space O(1)
    static int findUniqueNumberSorting(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1 && nums[i - 1] != nums[i]) {
                return nums[i];
            }

            if (nums[i] != nums[i + 1]) {

                if (i == 0 || nums[i - 1] != nums[i]) {
                    return nums[i];
                }

            }

        }

        return -1;
    }

    // Using nested loop: Time O(n ^ 2), Space O(1)
    static int findUniqueNumberNested(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (i == j) {
                    continue;
                }

                if (nums[i] == nums[j]) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                return nums[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findUniqueNumber(new int[]{1, 1, 2, 2, 3, 3, 4}));
        System.out.println(findUniqueNumber(new int[]{1, 1, 2, 3, 3, 4, 4}));

    }


}
