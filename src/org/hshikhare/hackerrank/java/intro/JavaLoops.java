package org.hshikhare.hackerrank.java.intro;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-loops-i
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 1;
        while (index < 11) {
            System.out.println(n + " x " + index + " = " + n * index++);
        }
    }
}
