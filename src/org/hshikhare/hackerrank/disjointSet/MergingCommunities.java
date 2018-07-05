package org.hshikhare.hackerrank.disjointSet;

import java.util.*;

/**
 * Created by Hanumant on 1/14/2018.
 */
public class MergingCommunities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfPpl = sc.nextInt();
        int queries = sc.nextInt();


        Set<List<String>> ppl = new HashSet<>();

        for (int i = 0; i < queries; i++) {

            String next = sc.next();

            String s1 = sc.next();

            if (next.equalsIgnoreCase("Q")) {


                boolean f = false;
                if (ppl.size() > 0) {
                    for (List p : ppl) {
                        if (p.contains(s1)) {
                            System.out.println(p.size());
                            f = true;
                            break;
                        }
                    }
                    if (!f) {
                        System.out.println(1);
                    }
                } else {
                    System.out.println(1);
                }

            } else if (next.equalsIgnoreCase("M")) {

                String s3 = sc.next();

                if (ppl.size() > 0) {
                    boolean f = false;
                    for (List<String> p : ppl) {
                        if (p.contains(s1)) {
                            p.add(s3);
                            f = true;
                            break;
                        }
                    }
                    if (!f) {
                        List<String> objects = new ArrayList<>();
                        objects.add(s1);
                        objects.add(s3);
                        ppl.add(objects);
                    }
                    f = false;
                } else {
                    List<String> objects = new ArrayList<>();
                    objects.add(s1);
                    objects.add(s3);
                    ppl.add(objects);
                }
            }
        }
    }
}



