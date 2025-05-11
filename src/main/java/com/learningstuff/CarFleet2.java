package com.learningstuff;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 5/5/25
 * Email: mdshamim723@gmail.com
 */

public class CarFleet2 {

    public static void main(String[] args) {

        System.out.println(carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}));
        System.out.println(carFleet(10, new int[]{1, 4}, new int[]{3, 2}));
        System.out.println(carFleet(10, new int[]{4, 1, 0, 7}, new int[]{2, 2, 1, 1}));

    }

    public static int carFleet(int target, int[] position, int[] speed) {

        int len = position.length;

        int[][] m = new int[len][2];

        for (int i = 0; i < len; i++) {
            m[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(m, Comparator.comparingInt(a -> a[0]));

        Stack<Double> st = new Stack<>();

        for (int i = len - 1; i >= 0; i--) {

            double s = (double) (target - m[i][0]) / m[i][1];

            st.push(s);

            if (st.size() >= 2 && st.peek() <= st.get(st.size() - 2)) {
                st.pop();
            }

        }

        return st.size();
    }


}
