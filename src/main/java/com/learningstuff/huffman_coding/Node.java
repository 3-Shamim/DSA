package com.learningstuff.huffman_coding;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/14/25
 * Email: mdshamim723@gmail.com
 */

public class Node implements Comparable<Node> {

    private char symbol;
    private int frequency;

    public Node(char symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Node that) {
        return this.frequency - that.frequency;
    }

}
