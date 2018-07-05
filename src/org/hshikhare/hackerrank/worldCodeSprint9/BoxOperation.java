package org.hshikhare.hackerrank.worldCodeSprint9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Created by h_shikhare on 1/28/2017.
 */
public class BoxOperation {

    static long[] box;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        box = new long[n];
        for (int i = 0; i < n; i++) {
            box[i] = in.nextLong();
        }
        int index = 0;
        Map<Integer, Object[]> operations = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int operation = in.nextInt();
            switch (operation) {
                case 1:
                    Object a[] = {OP.ADD, in.nextInt(), in.nextInt(), in.nextLong()};
                    operations.put(index++, a);
                    break;
                case 2:
                    Object b[] = {OP.DIVIDE, in.nextInt(), in.nextInt(), in.nextLong()};
                    operations.put(index++, b);
                    break;
                case 3:
                    Object[] c = {OP.MIN, in.nextInt(), in.nextInt()};
                    operations.put(index++, c);
                    break;
                case 4:
                    Object[] d = {OP.SUM, in.nextInt(), in.nextInt()};
                    operations.put(index++, d);
                    break;
            }
        }

        for (int i = 0; i < index; i++) {
            Object[] o = operations.get(i);
            switch ((OP) o[0]) {
                case ADD:
                    add((int) o[1], (int) o[2], (Long) o[3]);
                    break;
                case DIVIDE:
                    divide((int) o[1], (int) o[2], (Long) o[3]);
                    break;
                case MIN:
                    printMin((int) o[1], (int) o[2]);
                    break;
                case SUM:
                    printSum((int) o[1], (int) o[2]);
                    break;
            }
        }

    }

    static void add(int start, int end, Long num) {
        for (int i = start; i < end+1; i++) {
            box[i] += num;
        }

       // System.out.println(Arrays.toString(box));
    }

    static void divide(int start, int end, Long num) {
        for (int i = start; i < end+1; i++) {
            box[i] += Math.floorDiv(box[i], num);
        }
        //System.out.println(Arrays.toString(box));
    }

    static void printMin(int start, int end) {
        long l = LongStream.of(Arrays.copyOfRange(box, start, end + 1)).parallel().min().orElse(0);
        System.out.println(l);
    }

    static void printSum(int start, int end) {
        long sum = LongStream.of(Arrays.copyOfRange(box, start, end + 1)).parallel().sum();
        System.out.println(sum);
    }

    enum OP {ADD, DIVIDE, MIN, SUM}
}
