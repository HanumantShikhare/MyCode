package org.hshikhare.hackerrank.tutorial.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by h_shikhare on 1/17/2017.
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        boolean flag = true;
        if (m >= n) {
            Map<String, Integer> magazineMap = new HashMap<>(m);
            int temp;

            for (int magazine_i = 0; magazine_i < m; magazine_i++) {
                String next = in.next();
                temp = 1;
                if (magazineMap.containsKey(next)) {
                    temp = magazineMap.get(next) + 1;
                }
                magazineMap.put(next, temp);
            }
            for (int ransom_i = 0; ransom_i < n; ransom_i++) {
                String next = in.next();
                Integer integer = magazineMap.get(next);
                if (null == integer || integer == 0) {
                    flag = false;
                    break;
                } else {
                    magazineMap.put(next, integer - 1);
                }
            }
        } else {
            flag = false;
        }
        System.out.println(flag ? "Yes" : "No");
        in.close();
    }
}
