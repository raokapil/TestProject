package com.company.dataStructure.recursion;

// Place tiles of size 1 X M in a floor of size N X M.

// Tiles can be placed either vertically or horizontally
// If a tile (1 X M) is placed at one end (horizontally/ vertically ) of (N X M) place, then remaining beside sides will be placed
// in a same way. after that we just need to take care of its below remaining part .
// Total number of ways to fill below part are (N - M) ways.

// But if initially placed horizontally, then (N - 1) ways left to fill out remaining part.
public class PlaceTiles {

    public static int placeTiles(int n, int m) {

        // tiles can only be placed horizontally
        if (n < m) {
            return 1;
        }

        if (n == m) {
            return 2;
        }
        int placeVertically = placeTiles(n-m, m);
        int placeHorizontally = placeTiles(n-1 , m);

        return placeHorizontally + placeVertically;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int totalWays = placeTiles(n, m);
        System.out.println(totalWays);
    }
}
