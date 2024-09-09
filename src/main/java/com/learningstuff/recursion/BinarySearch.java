package com.learningstuff.recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 7/9/24
 * Time: 5:20 PM
 * Email: mdshamim723@gmail.com
 */

public class BinarySearch {

    static int binarySearch(int[] arr, int t, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == t) {
            return mid;
        } else if (t > arr[mid]) {
            return binarySearch(arr, t, mid + 1, e);
        } else {
            return binarySearch(arr, t, s, mid - 1);
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = binarySearch(arr, 9, 0, arr.length - 1);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(arr[index]);
        }


    }

}
