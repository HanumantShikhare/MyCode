package org.hshikhare.hackerrank.java.datastructure;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/28/2017.
 */
public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ints [][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
        System.out.println(largestHourglass(ints));
    }

    private static int largestHourglass(int[][] ints) {
        int[][] hourglass = {{0, 0}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};


        int sum = Integer.MIN_VALUE;
        int tempSum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int counter = 0;
                for (int[] hourglas : hourglass) {
                    if (6 > (i + hourglas[0]) && 6 > (j + hourglas[1])) {
                        counter++;
                        tempSum += ints[i + hourglas[0]][j + hourglas[1]];
                    }
                }
                if(counter ==6) {
                    sum = Integer.max(sum, tempSum);
                }
                System.out.println(sum);
                tempSum = 0;
            }
        }
        return sum;
    }
}
