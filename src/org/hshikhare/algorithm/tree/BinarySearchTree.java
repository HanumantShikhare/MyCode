package org.hshikhare.algorithm.tree;

import java.util.Random;

/**
 * Created by h_shikhare on 1/13/2017.
 * <p>
 * Binary Search Tree
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        int max = 2000;
        Random random = new Random();
        int[] arr = new int[max];
        int i = 0;
        while (i < max) {
            arr[i++] = random.nextInt(300);
        }
        i = 0;

        Tree tree = new Tree();
        tree.isEmpty(tree.head);
        while (i < max) {
            tree.head = tree.add(tree.head, arr[i++]);
        }
        tree.inOrderTraversal(tree.head);

        System.out.println("\nHeight of Tree is : " + tree.getHeight(tree.head));

        System.out.println("Deleted the node with value : " + arr[5]);
        tree.deleteNode(tree.head, arr[5]);
        tree.inOrderTraversal(tree.head);

        System.out.println("\nIs tree Balanced ?: " + (tree.isBalanced(tree.head) ? "Yes" : "No"));

        tree.inOrderTraversal(tree.head);

      //  tree.treeToDll(tree.head);
        System.out.println("\nBelow si the converted linked list");
        tree.printList();

        System.out.println();
        tree.inOrderTraversal(tree.head);
        System.out.println();

        tree.preOrderTraversal(tree.head);
        System.out.println();

        tree.postOrderTraversal(tree.head);
    }
}

class Tree {
    Node head;
    Node prev = null;
    Node newHead = null;

    int getHeight(Node node) {
        if (null != node) {
            return 1 + Math.max(getHeight(node.left), getHeight(node.right));
        } else {
            return 0;
        }
    }

    boolean isBalanced(Node root) {
        if (root == null) return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    Node add(Node current, int data) {
        if (current == null) {
            return new Node(data);
        } else {
            if (data < current.data) {
                current.left = add(current.left, data);
            } else {
                current.right = add(current.right, data);
            }
        }
        return current;
    }

    Node deleteNode(Node node, int data) {
        if (null != node) {
            if (node.data == data) {
                if (null == node.left && null == node.right) {
                    node = null;
                } else if (null != node.left && null == node.right) {
                    node = node.left;
                } else if (null == node.left) {
                    node = node.right;
                } else {
                    // to be implemented
                }
            } else {
                if (data < node.data) {
                    node.left = deleteNode(node.left, data);
                } else if (data > node.data) {
                    node.right = deleteNode(node.right, data);
                }
            }
        }
        return node;
    }

    boolean isEmpty(Node root) {
        if (null == root) {
            System.out.println("Tree is empty");
            return true;
        }
        return false;
    }


    public void treeToDll(Node root) {
        if (root == null) return;
        treeToDll(root.left);
        if (null == prev)
            newHead = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        treeToDll(root.right);
    }

    public void printList() {
        Node tmpNode = newHead;

        while (tmpNode != null) {
            System.out.print(tmpNode.data + " -> ");
            tmpNode = tmpNode.right;
        }

        System.out.print("null");
    }

    void inOrderTraversal(Node node) {
        if (null != node) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " -> ");
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal(Node node) {
        if (null != node) {
            System.out.print(node.data + " -> ");
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(Node node) {
        if (null != node) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            System.out.print(node.data + " -> ");
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}