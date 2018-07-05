package org.hshikhare.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by h_shikhare on 1/12/2017.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(300);
        }

        System.out.println("Before Sorting : \t" + Arrays.toString(arr));
        System.out.println("After Sorting : \t" + Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
            System.out.println((i + 1) + "\t" + Arrays.toString(arr));
        }
        return arr;
    }
}