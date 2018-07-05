package org.hshikhare.hackerrank.java.intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-currency-formatter
 */
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        Locale inLocal = new Locale("EN", "IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(inLocal);
        String india = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
