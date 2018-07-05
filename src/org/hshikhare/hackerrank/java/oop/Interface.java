package org.hshikhare.hackerrank.java.oop;

import java.util.Scanner;
import java.util.stream.IntStream;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

/**
 * Created by h_shikhare on 1/16/2017.
 * https://www.hackerrank.com/challenges/java-interface
 */
public class Interface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

       /*
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n % i == 0 ? i : 0;
        }
        return sum;
        */
        return IntStream.rangeClosed(1, n).parallel().filter(x -> n % x == 0).sum();
    }
}