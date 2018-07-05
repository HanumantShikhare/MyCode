package org.hshikhare.hackerrank.java.intro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/11/2017.
 * https://www.hackerrank.com/challenges/java-date-and-time
 */
public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        Calendar c = new GregorianCalendar();
        c.set(year, month - 1, day);

        DateFormat df = new SimpleDateFormat("EEEE");
        String format = df.format(c.getTime()).toUpperCase();
        System.out.println(format);


    }
}
