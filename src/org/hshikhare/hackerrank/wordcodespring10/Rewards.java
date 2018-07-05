package org.hshikhare.hackerrank.wordcodespring10;

import java.util.Scanner;

/**
 * Created by ${Hanumant} on 4/29/2017.
 */
public class Rewards {

    static int getPoints(int month1, int month2, int month3){
        return (month1 > 10 ? 100 : month1 * 10) + (month2 > 10 ? 100 : month2 * 10) + (month3 > 10 ? 100 : month3 * 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }
}
