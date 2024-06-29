package com.learningstuff.ds.binary_tree;

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

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "BTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

}