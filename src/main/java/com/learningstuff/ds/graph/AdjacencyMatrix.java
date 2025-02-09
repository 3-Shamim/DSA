package com.learningstuff.ds.graph;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/8/25
 * Email: mdshamim723@gmail.com
 */

public class AdjacencyMatrix {

    int[][] adjacencyMatrix;

    public AdjacencyMatrix(int len) {
        this.adjacencyMatrix = new int[len][len];
    }

    void addEdge(int i, int j) {
        this.adjacencyMatrix[i][j] = 1;
    }

    void addEdge(int i, int j, int weight) {
        this.adjacencyMatrix[i][j] = weight;
    }

    void displayMatrix() {

        for (int[] row : adjacencyMatrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        // 0, 1, 2 - Vertices
        int vertexLen = 3;

        AdjacencyMatrix matrix = new AdjacencyMatrix(vertexLen);
        matrix.addEdge(0, 1, 1);
        matrix.addEdge(0, 2, 1);
        matrix.addEdge(1, 2, 2);
        matrix.addEdge(2, 0, 5);

        matrix.displayMatrix();

    }

}
