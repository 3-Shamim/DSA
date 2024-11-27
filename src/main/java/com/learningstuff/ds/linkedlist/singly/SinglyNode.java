package com.learningstuff.ds.linkedlist.singly;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/23/24
 * Email: mdshamim723@gmail.com
 */

public class SinglyNode<T> {

    private T data;
    private SinglyNode<T> next;

    public SinglyNode(T data) {
        this.data = data;
    }

    public SinglyNode(T data, SinglyNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SinglyNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SinglyNode{" +
                "data=" + data +
                ", next=" + (next == null ? "" : next.getData()) +
                '}';
    }
}
