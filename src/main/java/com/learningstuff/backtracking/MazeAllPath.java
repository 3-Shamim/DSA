package com.learningstuff.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/16/24
 * Email: mdshamim723@gmail.com
 */

public class MazeAllPath {

    public static void main(String[] args) {

        int[][] maze = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] pathMatrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        allPath(maze, 0, 0, pathMatrix, 1);
        System.out.println("====================================================");
        System.out.println("====================================================");
        allPath(maze, 0, 0, new ArrayList<>());

    }

    private static void allPath(int[][] maze, int row, int col, int[][] pathMatrix, int depth) {

        int mRL = maze.length - 1;
        int mCL = maze[0].length - 1;

        if (row == mRL && col == mCL) {
            maze[row][col] = 1;
            pathMatrix[row][col] = depth;
            for (int[] pathRow : pathMatrix) {
                System.out.println(Arrays.toString(pathRow));
            }
            System.out.println("=========");
            return;
        }

        // visited
        if (maze[row][col] == 1) {
            return;
        }

        pathMatrix[row][col] = depth;
        maze[row][col] = 1;

        if (row < mRL) {
            allPath(maze, row + 1, col, pathMatrix, depth + 1);
        }

        if (col < mCL) {
            allPath(maze, row, col + 1, pathMatrix, depth + 1);
        }

        if (row > 0) {
            allPath(maze, row - 1, col, pathMatrix, depth + 1);
        }

        if (col > 0) {
            allPath(maze, row, col - 1, pathMatrix, depth + 1);
        }

        // Backtrack - Open for next path
        maze[row][col] = 0;
        pathMatrix[row][col] = 0;

    }

    private static void allPath(int[][] maze, int row, int col, List<Integer[]> res) {

        int mRL = maze.length - 1;
        int mCL = maze[0].length - 1;

        if (row == mRL && col == mCL) {

            res.add(new Integer[]{row, col});

            System.out.println(
                    res.stream().map(Arrays::toString).collect(Collectors.toList())
            );

            return;
        }

        if (maze[row][col] == 1) {
            return;
        }

        res.add(new Integer[]{row, col});

        maze[row][col] = 1;

        if (row < mRL) {
            allPath(maze, row + 1, col, new ArrayList<>(res));
        }

        if (col < mCL) {
            allPath(maze, row, col + 1, new ArrayList<>(res));
        }

        if (row > 0) {
            allPath(maze, row - 1, col, new ArrayList<>(res));
        }

        if (col > 0) {
            allPath(maze, row, col - 1, new ArrayList<>(res));
        }

        maze[row][col] = 0;

    }

}
