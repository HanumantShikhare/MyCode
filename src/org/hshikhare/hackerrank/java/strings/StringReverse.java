package org.hshikhare.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-string-reverse
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Yes" : "No");

    }
}
