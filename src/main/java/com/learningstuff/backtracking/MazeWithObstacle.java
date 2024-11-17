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

public class MazeWithObstacle {

    private static void mazeWithObstacle(int[][] maze, int row, int col, List<Integer[]> ans) {

        int mRL = maze.length - 1;
        int mCL = maze[0].length - 1;

        if (row == mRL && col == mCL) {
            ans.add(new Integer[]{row, col});
            System.out.println(
                    ans.stream().map(Arrays::toString).collect(Collectors.toList())
            );
            return;
        }

        int nonBlock = maze[row][col];

        if (nonBlock == 0) {
            return;
        }

        ans.add(new Integer[]{row, col});

        if (row < mRL) {
            mazeWithObstacle(maze, row + 1, col, new ArrayList<>(ans));
        }

        if (col < mCL) {
            mazeWithObstacle(maze, row, col + 1, new ArrayList<>(ans));
        }

    }

    private static void mazeWithObstacle1(int[][] maze, int row, int col, List<Integer[]> ans) {

        int rI = maze.length - row;
        int cI = maze[0].length - col;

        if (row == 1 && col == 1) {
            ans.add(new Integer[]{rI, cI}); // last
            System.out.println(
                    ans.stream().map(Arrays::toString).collect(Collectors.toList())
            );
            return;
        }

        ans.add(new Integer[]{rI, cI});

        int block = maze[rI][cI];

        if (row > 1 && block != 0) {
            mazeWithObstacle1(maze, row - 1, col, new ArrayList<>(ans));
        }

        if (col > 1 && block != 0) {
            mazeWithObstacle1(maze, row, col - 1, new ArrayList<>(ans));
        }

    }

    public static void main(String[] args) {

        // 0 represent obstacle
        int[][] maze = {
                {1, 1, 1},
                {0, 1, 1},
                {1, 1, 1}
        };

        mazeWithObstacle(maze, 0, 0, new ArrayList<>());
        System.out.println("====================================");
        mazeWithObstacle1(maze, 3, 3, new ArrayList<>());

    }

}
