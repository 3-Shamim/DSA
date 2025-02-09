package com.learningstuff.ds.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/9/25
 * Email: mdshamim723@gmail.com
 */

public class GraphNode<T> {

    private final T value;

    private final List<GraphNode<T>> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public GraphNode(T value, List<GraphNode<T>> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    public T getValue() {
        return value;
    }

    public List<GraphNode<T>> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(GraphNode<T> neighbor) {
        this.neighbors.add(neighbor);
    }

    public void addNeighbors(List<GraphNode<T>> neighbors) {
        this.neighbors.addAll(neighbors);
    }

}
