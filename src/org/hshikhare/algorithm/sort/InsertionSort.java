package org.hshikhare.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by h_shikhare on 1/12/2017.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[2000];
        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            arr[i] = random.nextInt(300);
        }
        System.out.println("Before Sorting : \t" + Arrays.toString(arr));
        System.out.println("After Sorting : \t" + Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            //System.out.println((i + 1) + "\t" + Arrays.toString(arr));
        }
        return arr;
    }
}
