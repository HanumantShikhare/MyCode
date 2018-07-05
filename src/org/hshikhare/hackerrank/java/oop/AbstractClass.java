package org.hshikhare.hackerrank.java.oop;

import java.util.Scanner;

/**
 * Created by h_shikhare on 1/16/2017.
 * https://www.hackerrank.com/challenges/java-abstract-class
 */
public class AbstractClass {
    public static void main(String[] args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

abstract class Book {
    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);

}