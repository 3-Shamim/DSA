package com.learningstuff.algo.count_sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/12/25
 * Email: mdshamim723@gmail.com
 */

public class CountSort {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 4, 6, 1, 3, 4, 5, 6, 0, 10};
        countSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{0, 4, 6, 1, 3, 4, 5, 6, 0, 10};
        countSortHashMap(arr1);
        System.out.println(Arrays.toString(arr1));

    }


    private static void countSortHashMap(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int v : arr) {
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        }

        int index = 0;

        for (Integer key : countMap.keySet()) {

            while (countMap.get(key) > 0) {
                arr[index++] = key;
                countMap.put(key, countMap.get(key) - 1);
            }

        }

    }

    private static void countSort(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        int[] counts = new int[max + 1];

        for (int v : arr) {
            counts[v]++;
        }

        int index = 0;

        for (int i = 0; i < counts.length; i++) {

            while (counts[i] > 0) {
                arr[index++] = i;
                counts[i]--;
            }

        }

    }

}
