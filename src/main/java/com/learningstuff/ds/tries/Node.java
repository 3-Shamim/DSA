package com.learningstuff.ds.tries;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/16/25
 * Email: mdshamim723@gmail.com
 */

public class Node {

    private final char value;
    private final boolean endOfChar;
    private final Node[] children;

    public Node(char value, boolean endOfChar) {
        this.value = value;
        this.endOfChar = endOfChar;
        this.children = new Node[26];
    }

    public char getValue() {
        return value;
    }

    public boolean isEndOfChar() {
        return endOfChar;
    }

    public Node[] getChildren() {
        return children;
    }

}
