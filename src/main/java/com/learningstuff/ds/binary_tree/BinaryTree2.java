package com.learningstuff.ds.binary_tree;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class BinaryTree2 {

    private Node root;

    public BinaryTree2() {
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        if (node == null) {
            Node n = new Node(value);
            n.height = 1;
            return n;
        }

        if (value < root.value) {
            node.left = insert(node.left, value);
        }

        if (value > root.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private void display() {

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

    public int preCalculateHeight() {
        return height(root);
    }

    public int calculateHeight() {
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
        return checkBalanced(root);
    }

    private boolean checkBalanced(Node node) {

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.abs(leftHeight - rightHeight) < 2;
    }

    public static void main(String[] args) {

        BinaryTree2 bt = new BinaryTree2();
        bt.insert(4);
        bt.insert(2);
        bt.insert(3);
        bt.insert(10);
        bt.insert(7);
        bt.insert(11);
        bt.insert(12);

        bt.display();

        System.out.println(bt.preCalculateHeight());
        System.out.println(bt.calculateHeight());
        System.out.println(bt.isBalanced());

    }

}
