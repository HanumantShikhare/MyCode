package org.hshikhare.string;

/**
 * Created by h_shikhare on 1/11/2017.
 */
public class StringReverse {

    public static void main(String[] args) {
        String s = stringReverse("abcdefghijklmnopqrstuvwxyz");
        System.out.println(s);
        s = stringReverseRec("Hellow World !");
        System.out.println(s);
    }

    private static String stringReverse(String s) {
        char[] chars = s.toCharArray();
        char[] returnString = new char[s.length()];
        for (int i = chars.length - 1, j = 0; i >= 0; i--) {
            returnString[j++] = chars[i];
        }
        return new String(returnString);
    }

    private static String stringReverseRec(String s) {
        if (s.length() == 1) {
            return s;
        }
        return stringReverse(s.substring(1)) + s.charAt(0);
    }
}
