package org.hshikhare.hackerrank.worldCodeSprint9;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/27/2017.
 */
public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result;
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();

            if (grade < 38) {
                result = grade;
            } else if (grade % 5 >= 3) {
                result = grade + 5 - grade % 5;
            } else {
                result = grade;
            }
            System.out.println(result);
        }
    }
}
