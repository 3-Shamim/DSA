package com.learningstuff.ds.tree.binary_tree;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/6/24
 * Time: 1:09 PM
 * Email: mdshamim723@gmail.com
 */

public class Node {

    int value;
    Node left;
    Node right;

    int height;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 0;
    }

    @Override
    public String toString() {
        return "BTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                ", height=" + height +
                '}';
    }

}