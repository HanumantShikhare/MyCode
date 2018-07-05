package org.hshikhare.hackerrank.java.oop;

/**
 * Created by h_shikhare on 1/16/2017.
 */
public class Inheritance2 {
    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}

class Arithmetic {
    int add(int i, int i1) {
        return i + i1;
    }
}

class Adder extends Arithmetic {
}