package com.learningstuff;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 5/5/25
 * Email: mdshamim723@gmail.com
 */

public class CarFleet {

    public static void main(String[] args) {

        System.out.println(carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}));
        System.out.println(carFleet(10, new int[]{1, 4}, new int[]{3, 2}));
        System.out.println(carFleet(10, new int[]{4, 1, 0, 7}, new int[]{2, 2, 1, 1}));

    }

    public static int carFleet(int target, int[] position, int[] speed) {
        return helper(target, position, speed, 0);
    }

    private static int helper(int target, int[] position, int[] speed, int ans) {

        for (int i = 0; i < position.length; i++) {

            int p = position[i];
            int s = speed[i];

            if (p < 0) {
                continue;
            }

            position[i] = p + s;

        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < position.length; i++) {

            int p = position[i];

            if (p < 0) {
                continue;
            }

            int s = speed[i];

            Integer pI = map.get(p);

            if (pI == null) {
                map.put(p, i);
            } else {

                int s2 = speed[pI];

                if (s < s2) {
                    position[pI] = -1;
                    map.put(p, i);
                } else {
                    position[i] = -1;
                }

            }

        }

        boolean allFleet = true;

        for (int i = 0; i < position.length; i++) {

            int p = position[i];

            if (p < 0) {
                position[i] += -1;
            } else if (p >= target) {

                position[i] = -1;
                ans++;

            } else {
                allFleet = false;
            }

        }

        if (!allFleet) {
            return helper(target, position, speed, ans);
        }

        return ans;
    }


}
