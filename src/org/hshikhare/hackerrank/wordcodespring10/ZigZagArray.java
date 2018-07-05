package org.hshikhare.hackerrank.wordcodespring10;

import java.util.Scanner;

/**
 * Created by ${Hanumant} on 4/29/2017.
 */
public class ZigZagArray {
    static int minimumDeletions(int[] a) {
        boolean flag = a[0] > a[1];
        for (int i = 0; i < a.length; i++) {
            if (flag && a[i] > a[i+1]) {
                continue;
            } else {

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }
}