package com.learningstuff.ds.tree.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 28/6/24
 * Time: 8:48 PM
 * Email: mdshamim723@gmail.com
 */

public class BinaryTree {

    private static int index = -1;

    static Node generate(int[] nums) {

        index++;

        if (nums.length == 0 || index >= nums.length || nums[index] == -1) {
            return null;
        }

        Node node = new Node(nums[index]);
        node.left = generate(nums);
        node.right = generate(nums);

        return node;
    }

    static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);

    }

    static void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");

    }

    static void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        // First level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node node = q.remove();

            if (node == null) {

                if (q.isEmpty()) {
                    break;
                } else { // this means current level is completed.
                    System.out.println();
                    q.add(null); // this is for next level partition
                }

            } else {

                System.out.print(node.value + " ");

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }

            }

        }

    }

    static int count(Node root) {

        if (root == null) {
            return 0;
        }

        int left = count(root.left);
        int right = count(root.right);

        return  left + right + 1;
    }

    static int sum(Node root) {

        if (root == null) {
            return 0;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        return  left + right + root.value;
    }

    static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    static int diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int d =  lh + rh + 1;

        int l = diameter(root.left);
        int r = diameter(root.right);

        return Math.max(Math.max(l, r), d);
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, -1, -1, 4, -1, -1, 5, 6, 8, -1, -1, -1, 7, -1, -1};
        Node root = generate(nums);

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        levelOrder(root);
        System.out.println();

        System.out.println(count(root));

        System.out.println(sum(root));

        System.out.println(height(root));

        System.out.println(diameter(root));


    }

}

