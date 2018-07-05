package org.hshikhare.hackerrank.java.oop;

/**
 * Created by h_shikhare on 1/16/2017.
 */
public class MethodOverriding2 {
    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}


class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me(); //Fix this line .. fixed
        System.out.println("My ancestor is a cycle who is " + temp);
    }

    String define_me() {
        return "a cycle with an engine.";
    }
}
