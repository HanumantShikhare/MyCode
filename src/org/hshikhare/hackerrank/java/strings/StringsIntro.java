package org.hshikhare.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-strings-introduction
 */
public class StringsIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1, A.length()) + " "
                + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length()));

        sc.close();

    }
}
