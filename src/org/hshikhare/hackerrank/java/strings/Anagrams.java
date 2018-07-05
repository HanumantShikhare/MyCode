package org.hshikhare.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-anagrams
 */
public class Anagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function by writing your code here.

        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);


        return String.valueOf(ac).equals(String.valueOf(bc));
    }

}
