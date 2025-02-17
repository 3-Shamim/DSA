package com.learningstuff.ds.tree.binary_tree;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/11/24
 * Email: mdshamim723@gmail.com
 */

public class AVL {

    private Node root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {

        if (node == null) {
            Node newNode = new Node(value);
            newNode.height = 1;
            return newNode;
        }

        if (value <= node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {

        int diff = height(node.left) - height(node.right);

        // left side
        if (diff > 1) {

            int leftDiff = height(node.left.left) - height(node.left.right);

            // left
            if (leftDiff > 0) {
                node = rotateToRight(node);
            }

            // right
            if (leftDiff < 0) {
                node = rotateToRight(node);
            }

        }

        // right
        if (diff < -1) {

            int rightDiff = height(node.right.left) - height(node.right.right);

            // left
            if (rightDiff > 0) {
                node = rotateToLeft(node);
            }

            // right
            if (rightDiff < 0) {
                node = rotateToLeft(node);
            }

        }

        return node;
    }

    private Node rotateToRight(Node node) {

        Node temp = node.left.right;
        node.left.right = node;
        node = node.left;
        node.right.left = temp;

        Node oldP = node.right;
        oldP.height = Math.max(height(oldP.left), height(oldP.right)) + 1;
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private Node rotateToLeft(Node node) {

        Node temp = node.right.left;
        node.right.left = node;
        node = node.right;
        node.left.right = temp;

        Node oldP = node.left;
        oldP.height = Math.max(height(oldP.left), height(oldP.right)) + 1;
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int height() {
        return root.height;
    }

    private int calculateHeight() {
        return calculateHeight(root);
    }

    private int calculateHeight(Node node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced() {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1;
    }

    public void display() {

        preOrder(root);
        System.out.println();

    }

    private void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");

        preOrder(node.left);
        preOrder(node.right);

    }

    public static void main(String[] args) {

        AVL avl = new AVL();

        for (int i = 0; i < 1000; i++) {
            avl.insert(i);
        }

        avl.display();

        System.out.println(avl.height());
        System.out.println(avl.calculateHeight());
        System.out.println(avl.isBalanced());

    }

}
