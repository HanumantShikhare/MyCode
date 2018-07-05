package org.hshikhare.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by h_shikhare on 1/12/2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[200];
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            arr[i] = random.nextInt(300);
        }

        System.out.println("Before Sorting : \t" + Arrays.toString(arr));
        System.out.println("After Sorting : \t" + Arrays.toString(bubbleSort(arr)));

        int[] arr1 = new int[200];
        for (int i = 0; i < 200; i++) {
            arr1[i] = random.nextInt(300);
        }
        System.out.println("\n\nBefore Sorting : \t" + Arrays.toString(arr));
        System.out.println("After Sorting : \t" + Arrays.toString(bubbleSortMemoization(arr1)));

    }

    private static int[] bubbleSort(int[] arr) {
        int temp;
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < maxIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            maxIndex--;
            System.out.println((i + 1) + "\t" + Arrays.toString(arr));
        }
        return arr;
    }

    private static int[] bubbleSortMemoization(int[] arr) {
        int temp;
        boolean sorted = false;
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length && !sorted; i++) {
            sorted = true;
            for (int j = 0; j < maxIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            maxIndex--;
            System.out.println((i + 1) + "\t" + Arrays.toString(arr));
        }
        return arr;
    }
}
