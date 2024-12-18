package com.learningstuff.ds.binary_tree.segment_tree;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/18/24
 * Email: mdshamim723@gmail.com
 */

public class STNode {

    int data;
    int start;
    int end;
    STNode left;
    STNode right;

    public STNode(int start, int end) {
        this.start = start;
        this.end = end;
    }

}
