package org.hshikhare.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 */
public class IPRegexValidator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    final String pattern = "";
}