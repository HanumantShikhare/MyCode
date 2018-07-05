package org.hshikhare.hackerrank.java.intro;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-loops
 */
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.hasNext() ? scanner.nextInt() : 0;
        if (testCases > 0) {
            for (int i = 0; i < testCases; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                BigDecimal sum = BigDecimal.valueOf(a);

                for (int k = 1; k <= n; k++) {

                    for (int j = 0; j < k; j++) {
                        sum = sum.add(new BigDecimal(Math.pow(2, j) * b));
                    }
                    System.out.print(sum + " ");
                    sum = BigDecimal.valueOf(a);
                }
                System.out.println();
            }
        }
    }
}
