package com.learningstuff;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৩/৬/২৪
 * Time: ৭:৫২ AM
 * Email: mdshamim723@gmail.com
 */

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(findIndexFromIntArray(arr, 2));
        System.out.println(findIndexFromIntArray(arr, 9));

        try {
            findFromIntArray(arr, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<String> strings = Arrays.asList("a", "b", "c");
        System.out.println(findFromList(strings, "a"));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        System.out.println(findFromList(integers, 1));
        System.out.println(findFromList(integers, 6));

    }

    public static  <T> T findFromList(List<T> list, T element) {

        for (T t : list) {

            if (t.equals(element)) {
                return t;
            }

        }

        throw new RuntimeException("Element is not exist in the list");

    }

    public static  <T> int findIndexFromList(List<T> list, T element) {

        for (int i = 0; i < list.size(); i++) {

            T t = list.get(i);

            if (t.equals(element)) {
                return i;
            }

        }

        return -1;
    }

    public static int findMinFromIntArray(int[] arr, int element) {

        if (arr.length == 0) {
            throw new RuntimeException("Given array is empty.");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Same as below
            // min = Math.min(min, arr[i]);

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return min;
    }

    public static int findFromIntArray(int[] arr, int element) {

        for (int i : arr) {
            if (i == element) {
                return i;
            }
        }

        throw new RuntimeException("Element is not exist in the array");
    }

    public static int findIndexFromIntArray(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                return i;
            }

        }

        return -1;
    }

}