package com.learningstuff.ds.linkedlist.doubly;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/25/24
 * Email: mdshamim723@gmail.com
 */

public class DoublyNode<T> {

    private T data;
    private DoublyNode<T> next;
    private DoublyNode<T> previous;

    public DoublyNode(T data) {
        this.data = data;
    }

    public DoublyNode(T data, DoublyNode<T> previous) {
        this.data = data;
        this.previous = previous;
    }

    public DoublyNode(T data, DoublyNode<T> next, DoublyNode<T> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "data=" + data +
                ", next=" + (next == null ? "" : next.getData()) +
                ", previous=" + (previous == null ? "" : previous.getData()) +
                '}';
    }
}
