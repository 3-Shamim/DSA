package com.learningstuff.ds.binary_tree.segment_tree;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/18/24
 * Email: mdshamim723@gmail.com
 */

public class SegmentTree {

    STNode root;

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        SegmentTree st = new SegmentTree();

        st.root = st.generate(arr, 0, arr.length - 1);

        st.display();

        System.out.println("1-3 Range sum: " + st.findSum(1, 3));
        System.out.println("2-3 Range sum: " + st.findSum(3, 5));

    }

    private int findSum(int start, int end) {

        if (start > end) {
            return 0;
        }

        return findRangeSum(root, start, end);
    }

    private int findRangeSum(STNode node, int start, int end) {

        if (start > node.end || end < node.start) {
            return 0;
        }

        if (node.start >= start && node.end <= end) {
            return node.data;
        }

        return findRangeSum(node.left, start, end) + findRangeSum(node.right, start, end);
    }

    private void display() {

        preOrder(root);
        System.out.println();

    }

    private void preOrder(STNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);

    }

    private STNode generate(int[] arr, int start, int end) {

        if (start == end) {
            STNode leaf = new STNode(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        STNode node = new STNode(start, end);

        int mid = start + (end - start) / 2;

        node.left = generate(arr, start, mid);
        node.right = generate(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

}
