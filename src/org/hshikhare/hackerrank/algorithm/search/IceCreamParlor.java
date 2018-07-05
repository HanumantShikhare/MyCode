package org.hshikhare.hackerrank.algorithm.search;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/14/2017.
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalTestCases = s.nextInt();
        int tempMoney = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int money = s.nextInt();
            int numberOfFlavours = s.nextInt();

            int[] prices = new int[numberOfFlavours];

            for (int j = 0; j < numberOfFlavours; j++) {
                prices[j] = s.nextInt();
            }

            for (int j = 0; j < numberOfFlavours; j++) {
                for (int j2 = j + 1; j2 < numberOfFlavours; j2++) {

                    tempMoney = prices[j] + prices[j2];
                    if (tempMoney == money) {
                        System.out.println((j + 1) + " " + (j2 + 1));
                    }

                }
            }
        }
    }
}