package Graphs;
import java.util.*;

// Leetcode 200: https://leetcode.com/problems/number-of-islands/

/*  Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water. */

public class NumberOfIslands {

    static class Index {
        int row, col;

        public Index(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void bfs(char[][] grid, int i, int j, boolean[][] vis) {

        Queue<Index> q = new LinkedList<>();
    }


    public static int numIslands(char[][] grid) {
        int islands = 0;
        if(grid == null)
            return islands;

        int row = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) 
            {
                char curr =  grid[i][j];  
                if(curr == '1' && vis[i][j] == false) {
                    bfs(grid, i, j, vis);
                    islands++;
                }
            }
        }

        return islands;
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        System.out.println(numIslands(grid));
    }
}
