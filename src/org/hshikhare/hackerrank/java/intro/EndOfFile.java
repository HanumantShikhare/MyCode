package org.hshikhare.hackerrank.java.intro;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-end-of-file
 */
public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 1;

        while (sc.hasNextLine()) {
            System.out.println(index++ + " " + sc.nextLine());
        }
    }
}
