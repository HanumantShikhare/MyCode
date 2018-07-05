package org.hshikhare.algorithm.linkedlist;


import java.util.Random;

/**
 * Created by h_shikhare on 1/20/2017.
 */

public class LinkedList {
    public static void main(String[] args) {

        Random random = new Random();

        int deleteValue = 0;

        List list = new List();
        for (int i = 0; i < 20; i++) {
            int i1 = random.nextInt(300);
            list.add(i1);
            if (i == 0) {
                deleteValue = i1;
            }
        }

        list.printList();


        Node node1 = list.deleteNodeHeigherThan(list.head, 70);
        list.printList(node1);

        System.out.println("Deleting Node : " + deleteValue);

        boolean b = list.deleteNode(deleteValue);
        if (!b) {
            System.out.println("Node with value : " + deleteValue + " do not exists in list");
        }
        list.printList();

        System.out.println("Reversing the list");
        Node node = list.reverseList();
        list.printList(node);
    }
}

class List {
    public Node head;

    void add(int data) {
        if (null == head) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    Node deleteNodeHeigherThan(Node node, int data) {
        if (null != node) {
            int index = 0;
            Node current = node;
            Node previous;
            do {
                if (current.data > data) {
                    previous = current.next;
                    if (index != 0)
                        current.next = null;
                    else {
                        current = previous.next;
                        node = current;
                    }
                } else {
                    node = current;
                    previous = current;
                }
                index++;
                current = current.next;
            } while (null != current);
        }
        return node;
    }

    void printList(Node node) {
        if (null == node) {
            System.out.println("List is empty");
        } else {
            Node current = node;
            do {
                System.out.print(" -> " + current.data);
                current = current.next;
            } while (null != current);
        }
        System.out.println("");
    }

    void printList() {
        printList(head);
    }

    boolean deleteNode(int data) {
        boolean flag = false;
        if (null != head) {
            int index = 0;
            Node current = head;
            Node previous = head;
            do {
                if (current.data == data) {
                    previous.next = current.next;
                    if (index++ != 0)
                        current.next = null;
                    else {
                        current = previous.next;
                        head = current;
                    }
                    flag = true;
                }
                previous = current;
                current = current.next;
            } while (null != current);
        }
        return flag;
    }

    Node reverseList() {
        Node current = head;
        Node previous = null;
        Node tempHead;

        if (null != head) {

            do {
                tempHead = current.next;
                current.next = previous;
                previous = current;
                current = tempHead;
            } while (current != null);
        }

        return previous;
    }

    void sortLinkedList() {
        if (null != head) {

        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
