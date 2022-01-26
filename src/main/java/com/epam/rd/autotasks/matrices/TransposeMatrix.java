package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0)//empty or unset array, nothing do to here
            return matrix;

        int width = matrix.length;
        int height = matrix[0].length;

        int[][] array_new = new int[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                array_new[y][x] = matrix[x][y];
            }
        }
        return array_new;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] matrix = {
                {1, 2},
                {7, -13}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
