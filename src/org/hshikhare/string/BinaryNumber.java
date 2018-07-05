package org.hshikhare.string;

/**
 * Created by h_shikhare on 1/11/2017.
 */
public class BinaryNumber {
    public static void main(String[] args) {
        printBinary(185);
        System.out.println(Integer.toBinaryString(185));
    }

    private static void printBinary(int num) {
        String s = "";
        while (num > 0) {
            s = num % 2 + s;
            num /= 2;
        }
        System.out.println(s);
    }
}
