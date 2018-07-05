package org.hshikhare.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/12/2017.
 * https://www.hackerrank.com/challenges/java-biginteger
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final BigInteger i = sc.nextBigInteger();
        final BigInteger j = sc.nextBigInteger();

        System.out.println(i.add(j));
        System.out.println(i.multiply(j));
    }
}
