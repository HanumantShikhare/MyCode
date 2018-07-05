package org.hshikhare.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-substring
 */
public class Substr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(s.substring(start, end));
    }
}
