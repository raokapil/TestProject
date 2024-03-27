package com.company.dataStructure.recursion;

public class MazeCountPaths {

    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) { // exceeds matrix boundary
            return 0;
        }

        if (i == (n-1) && j ==(m-1)) { // found end of the path
            return 1;
        }

        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i,j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {

        int n = 3, m= 3;
        int paths = countPaths(0, 0, n, m);
        System.out.println(paths);
    }
}
