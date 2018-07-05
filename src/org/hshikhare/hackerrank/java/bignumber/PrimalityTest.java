package org.hshikhare.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/12/2017.
 * https://www.hackerrank.com/challenges/java-primality-test
 */
public class PrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        boolean probablePrime = n.isProbablePrime(1);
        System.out.println(probablePrime ? "prime" : "not prime");
    }
}
