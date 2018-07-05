package org.hshikhare.code;

import java.util.Arrays;

/**
 * Created by h_shikhare on 1/13/2017.
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(Arrays.toString(arr));
        int water = findWater(arr);
        System.out.println("Total water trapped = " + water);
    }

    private static int findWater(int[] arr) {
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < length; i++) {
            left[i] = Math.max(max, arr[i]);
            max = left[i];
        }

        max = arr[length - 1];
        right[length - 1] = arr[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            right[i] = Math.max(max, arr[i]);
            max = right[i];
        }
        int water = 0;
        for (int i = 0; i < length; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        return water;

    }
}