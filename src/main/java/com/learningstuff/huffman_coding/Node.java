package com.learningstuff.huffman_coding;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/14/25
 * Email: mdshamim723@gmail.com
 */

public class Node implements Comparable<Node> {

    private final char symbol;
    private final int frequency;
    private final Node left;
    private final Node right;

    public Node(char symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    public Node(char symbol, int frequency, Node left, Node right) {
        this.symbol = symbol;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getFrequency() {
        return frequency;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public int compareTo(Node that) {
        return this.frequency - that.frequency;
    }

    @Override
    public String toString() {
        return "Node{" +
                "symbol=" + symbol +
                ", frequency=" + frequency +
                '}';
    }

}
