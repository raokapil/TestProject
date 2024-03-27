package com.company.LeetCode.Array;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix (swap rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to achieve clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }



    public int[][] rotateWithSpace(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n]; // Create a new matrix for the rotated image

        // Fill the rotated matrix by copying elements in reverse order
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j]; // Clockwise rotation
            }
        }

        return rotated;
    }
}
