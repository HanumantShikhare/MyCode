package org.hshikhare.hackerrank.projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/15/2017.
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 */
public class MultipleOf3N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        if (testCases > 0) {
            for (int i = 0; i < testCases; i++) {
                long nextInt = scanner.nextLong();
                System.out.println(getSum(nextInt));
            }
        }
        scanner.close();
    }

    static BigInteger getSum(long num) {

        // to make sure we exclude the num from the calculations
        long i3 = num % 3 == 0 ? num - 1 : num;
        long i7 = num % 5 == 0 ? num - 1 : num;
        long i8 = num % 15 == 0 ? num - 1 : num;

        // calculate total numbers to count
        long i = (i3 - i3 % 3) / 3;
        long i1 = (i7 - i7 % 5) / 5;
        long i2 = (i8 - i8 % 15) / 15;

        // using formula to caculate the sum of 1..n and then multiplying by the 3,5,15
        long i4 = (i * (i + 1) / 2) * 3;
        long i5 = (i1 * (i1 + 1) / 2) * 5;
        long i6 = (i2 * (i2 + 1) / 2) * 15;

        // sum of 15 is the one which is repeated in our summation so subtract it
        return BigInteger.valueOf(i4 + i5 - i6);

    }
}
