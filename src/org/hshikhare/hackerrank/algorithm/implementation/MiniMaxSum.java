package org.hshikhare.hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Created by h_shikhare on 1/15/2017.
 * https://www.hackerrank.com/challenges/mini-max-sum
 */
public class
MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] arr = new long[5];
        arr[0] = in.nextLong();
        arr[1] = in.nextLong();
        arr[2] = in.nextLong();
        arr[3] = in.nextLong();
        arr[4] = in.nextLong();

        Arrays.sort(arr);

        Long max = LongStream.of(arr).sum() - arr[0];
        Long min = LongStream.of(arr).sum() - arr[4];

        System.out.println(min + " " + max);
    }
}
