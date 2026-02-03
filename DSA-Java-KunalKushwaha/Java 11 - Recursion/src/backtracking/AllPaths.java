package backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allPaths("",board,0,0);

        int[][] path = new int[board.length][board[0].length];
        allPathsPrint("",board,0,0,path,1);
    }


    static void allPaths(String p, boolean[][] maze, int r,int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D',maze, r+1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c+1);
        }
        if (r > 0) {
            allPaths(p + 'U', maze, r-1,c);
        }
        if (c > 0) {
            allPaths(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove tha changes that were made by that function
        maze[r][c] = true;

    }

    // Backtracking problem - it is coming back to the same point where it started
    // do not move back the same path

    // how to solve - all cells that are visited, mark them as false, so that it doesn't go there

    // common sense : Marking false == 1 have that cell in my current path. So when that path is over, eg. you are in another recursion call, those cells should not be false
    // --> while you are moving back, you restore the maze as it was
    // - when do we go back - happens when function is returned (basic recursion concept, we have found one of the ans)
    // When you come out of the recursive function, you are now in above recursion call. Hence, remark the cell as true.

    // This is known as backtracking.
    // - you are making some changes while going in the below recursion calls. So when you go outside those recursion calls, changes made via those recursion calls should also not be available

    // thought process of backtracking - make a change and reverse the change when the work is done




    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][]path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathsPrint(p + 'D',maze, r+1, c, path, step+1);
        }
        if (c < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, r, c+1, path, step+1);
        }
        if (r > 0) {
            allPathsPrint(p + 'U', maze, r-1,c, path, step+1);
        }
        if (c > 0) {
            allPathsPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove tha changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
