package org.hshikhare.hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/15/2017.
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler002
 */
public class EvenFibonacciNumbers {

    private static long sum = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            sumOFEvenNumbers(n, 1, 2);
            System.out.println(sum);
            sum = 0;
        }
    }

    private static void sumOFEvenNumbers(long num, long first, long second) {
        if (num > first ) {
            sum += first % 2 == 0 ? first : 0;
            sumOFEvenNumbers(num, second, second + first);
        }
    }
}
