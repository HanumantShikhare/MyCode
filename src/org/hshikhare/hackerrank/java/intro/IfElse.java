package org.hshikhare.hackerrank.java.intro;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-if-else
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        int mod = n % 2;
        if (mod == 1 || (mod == 0 && 6 <= n && n <= 20)) {
            ans = "Weird";
        } else if ((2 <= n && n <= 5) || n > 20) {
            ans = "Not Weird";
        }
        System.out.println(ans);
        sc.close();

    }
}

