package org.hshikhare.hackerrank.algorithm.search;

import java.util.*;

/**
 * Created by h_shikhare on 1/13/2017.
 * https://www.hackerrank.com/challenges/missing-numbers
 */
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listASize = scanner.nextInt();
        Map<Integer, Integer> mapA = new HashMap<>();
        int a;
        for (int i = 0; i < listASize; i++) {
            a = scanner.nextInt();
            if (null == mapA.get(a)) {
                mapA.put(a, 1);
            } else {
                mapA.put(a, mapA.get(a) + 1);
            }
        }
        int listBSize = scanner.nextInt();
        Map<Integer, Integer> mapB = new HashMap<>();
        int b;
        for (int i = 0; i < listBSize; i++) {
            b = scanner.nextInt();
            if (null == mapB.get(b)) {
                mapB.put(b, 1);
            } else {
                mapB.put(b, mapB.get(b) + 1);
            }
        }

        List<Integer> missing = new ArrayList<>();
        Set<Integer> integers = mapB.keySet();

        integers.forEach(x -> {
            Integer integerA = mapA.get(x);
            Integer integerB = mapB.get(x);

            if (integerA == null || integerA < integerB) {
                missing.add(x);
            }
        });

        Collections.sort(missing);

        for (int m : missing) {
            System.out.print(m + " ");
        }
    }
}
