package org.hshikhare.hackerrank.java.intro;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-static-initializer-block
 */
public class StaticBlock {
    static boolean flag = false;
    static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        // provided code
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
