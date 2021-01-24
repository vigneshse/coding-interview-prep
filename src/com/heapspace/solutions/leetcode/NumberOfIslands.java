package com.heapspace.solutions.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    class Position{
        int x;
        int y;

        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {

        if(grid.length == 0) return 0;

        int rowLen = grid.length;
        int colLen = grid[0].length;

        int islands = 0;
        for(int row = 0 ; row < rowLen; row++){
            for(int col = 0 ; col < colLen ; col++){
                if(grid[row][col] == '1'){

                    grid[row][col] = 'v';
                    Queue<Position> queue = new LinkedList();
                    queue.offer(new Position(row,col));

                    while(!queue.isEmpty()){

                        Position position = queue.poll();
                        if(isValidRange(position.x, position.y+1, rowLen, colLen) && grid[position.x][position.y+1] == '1'){
                            queue.offer(new Position(position.x, position.y+1));
                            grid[position.x][position.y+1] = 'v';
                        }
                        if(isValidRange(position.x, position.y-1, rowLen, colLen) && grid[position.x][position.y-1] == '1'){
                            queue.offer(new Position(position.x, position.y-1));
                            grid[position.x][position.y-1] = 'v';
                        }
                        if(isValidRange(position.x-1, position.y, rowLen, colLen) && grid[position.x-1][position.y] == '1'){
                            queue.offer(new Position(position.x-1, position.y));
                            grid[position.x-1][position.y] = 'v';
                        }
                        if(isValidRange(position.x+1, position.y, rowLen, colLen) && grid[position.x+1][position.y] == '1'){
                            queue.offer(new Position(position.x+1, position.y));
                            grid[position.x+1][position.y] = 'v';
                        }
                    }
                    ++islands;
                }
            }
        }
        return islands;
    }

    private boolean isValidRange(int x, int y, int rowLen, int colLen){
        return (0 <= x && x < rowLen && 0 <= y && y < colLen) ? true : false;
    }

    public static void main(String args[]){
        NumberOfIslands ni = new NumberOfIslands();
        char[][] matrix = {
                {'0','1','0','1','0'},
                {'0','0','1','1','1'},
                {'1','0','0','1','0'},
                {'0','1','1','0','0'},
                {'1','0','1','0','1'}
        };

        System.out.println(ni.numIslands(matrix));
    }

}
