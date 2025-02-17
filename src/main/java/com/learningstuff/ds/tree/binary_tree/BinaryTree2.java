package com.learningstuff.ds.tree.binary_tree;

import com.learningstuff.Pair;

import java.util.*;
import java.util.stream.Collectors;

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

        if (value < node.value) {
            node.left = insert(node.left, value);
        }

        if (value > node.value) {
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

        bt.printVerticalOrder();
        System.out.println();
        bt.printVerticalOrderUsingBFS();

    }

    public void printVerticalOrderUsingBFS() {

        int min = 0;
        int max = 0;

        Map<Integer, List<Node>> map = new HashMap<>();

        Queue<Pair<Node, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(this.root, 0));

        while (!queue.isEmpty()) {

            Pair<Node, Integer> remove = queue.remove();

            min = Math.min(min, remove.getSecond());
            max = Math.max(max, remove.getSecond());

            List<Node> nodes = map.getOrDefault(remove.getSecond(), new ArrayList<>());
            nodes.add(remove.getFirst());
            map.put(remove.getSecond(), nodes);

            if (remove.getFirst().left != null) {
                queue.add(new Pair<>(remove.getFirst().left, remove.getSecond() - 1));
            }

            if (remove.getFirst().right != null) {
                queue.add(new Pair<>(remove.getFirst().right, remove.getSecond() + 1));
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.println(
                    map.get(i).stream().map(node -> node.value).collect(Collectors.toSet())
            );
        }

    }

    public void printVerticalOrder() {

        Map<Integer, List<Node>> map = new HashMap<>();

        int[] range = verticalOrderHelper(this.root, 0, map);

        for (int i = range[0]; i <= range[1]; i++) {
            System.out.println(
                    map.get(i).stream().map(node -> node.value).collect(Collectors.toSet())
            );
        }

    }

    private int[] verticalOrderHelper(Node node, int col, Map<Integer, List<Node>> map) {

        if (node == null) {
            return new int[]{0, 0};
        }

        List<Node> nodes = map.getOrDefault(col, new ArrayList<>());
        nodes.add(node);
        map.put(col, nodes);

        int[] left = verticalOrderHelper(node.left, col - 1, map);

        int[] right = verticalOrderHelper(node.right, col + 1, map);

        int min = Math.min(left[0], right[0]);
        int max = Math.max(left[1], right[1]);

        return new int[]{
                Math.min(col, min),
                Math.max(col, max)
        };
    }

}
