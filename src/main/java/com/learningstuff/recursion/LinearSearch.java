package com.learningstuff.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 10/10/24
 * Email: mdshamim723@gmail.com
 */

public class LinearSearch {

    static boolean find(int[] arr, int t, int i) {

        if (i == arr.length) {
            return false;
        }

        return arr[i] == t || find(arr, t, i + 1);
    }

    static int findIndex(int[] arr, int t, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == t) {
            return i;
        }

        return findIndex(arr, t, i + 1);
    }

    static void findAllIndex(int[] arr, int t, int i, List<Integer> res) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == t) {
            res.add(i);
        }

        findAllIndex(arr, t, i + 1, res);
    }

    static List<Integer> findAllIndex1(int[] arr, int t, int i, List<Integer> res) {

        if (i == arr.length) {
            return res;
        }

        if (arr[i] == t) {
            res.add(i);
        }

        return findAllIndex1(arr, t, i + 1, res);
    }

    static List<Integer> findAllIndex2(int[] arr, int t, int i) {

        List<Integer> list = new ArrayList<>();

        if (i == arr.length) {
            return list;
        }

        if (arr[i] == t) {
            list.add(i);
        }

        List<Integer> data = findAllIndex2(arr, t, i + 1);

        list.addAll(data);

        return list;
    }

    public static void main(String[] args) {

        System.out.println(find(new int[]{1, 3, 5, 7, 9, 4}, 4, 0));
        System.out.println(find(new int[]{1, 3, 5, 7, 9, 4}, 13, 0));
        System.out.println(findIndex(new int[]{1, 3, 5, 7, 9, 4}, 4, 0));
        System.out.println(findIndex(new int[]{1, 3, 5, 7, 9, 4}, 13, 0));

        List<Integer> res = new ArrayList<>();

        findAllIndex(new int[]{1, 3, 5, 4, 7, 9, 4, 4}, 4, 0, res);

        System.out.println(res);

        System.out.println(
                findAllIndex1(
                        new int[]{1, 3, 5, 4, 7, 9, 4, 4}, 4, 0, new ArrayList<>()
                )
        );

        System.out.println(findAllIndex2(new int[]{1, 3, 5, 4, 7, 9, 4, 4}, 4, 0));

    }

}