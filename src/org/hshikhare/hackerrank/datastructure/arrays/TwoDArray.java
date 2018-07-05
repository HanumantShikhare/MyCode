package org.hshikhare.hackerrank.datastructure.arrays;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/22/2017.
 * https://www.hackerrank.com/challenges/2d-array
 */
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ints = new int[6][6];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
       /* for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.inOrderTraversal(ints[i][j] + "\t");
            }
            System.out.println();
        }*/
        System.out.println(largestHourglass(ints));
    }

    private static int largestHourglass(int[][] ints) {
        int[][] hourglass = {{0, 0}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};

        int length = ints.length;
        int sum = Integer.MIN_VALUE;
        int tempSum = 0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int[] hourglas : hourglass) {
                    if (6 > (i + hourglas[0]) && 6 > (j + hourglas[1])) {
                        tempSum += ints[i + hourglas[0]][j + hourglas[1]];
                        counter++;
                    }
                }
                if (counter != 6) {
                    tempSum = 0;
                }
                sum = Integer.max(sum, tempSum);
                tempSum = 0;
            }
        }
        return sum;
    }
}
