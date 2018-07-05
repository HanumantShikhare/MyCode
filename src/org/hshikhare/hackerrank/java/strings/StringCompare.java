package org.hshikhare.hackerrank.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-string-compare
 */
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length() - len + 1; i++) {
            String substring = str.substring(i, i + len);
            list.add(substring);
        }
        Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        sc.close();
    }
}
