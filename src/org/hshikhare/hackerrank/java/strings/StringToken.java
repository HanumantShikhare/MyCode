package org.hshikhare.hackerrank.java.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-string-tokens
 */
public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s, "!,?._'@ ");

        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreElements()) {
            String str = (String) tokenizer.nextElement();
            System.out.println(str);
        }

        scan.close();
    }
}
