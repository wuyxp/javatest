package com.sudoku;

public class Sudoku {
    private final static int LENGTH = 9;
    private int[][] matrix = new int[LENGTH][LENGTH];

    Sudoku() {

    }

    // 生成矩阵，当有参数时：则输入测试矩阵
    int[][] generatorMatrix() {
        int[][] gMatrix = new int[LENGTH][LENGTH];

        return gMatrix;
    }

    int[][] generatorMatrix(String s) {
        if (s.equalsIgnoreCase("test")) {
            int[][] testMatrix = new int[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                for (int j = 0; j < LENGTH; j++) {
                    testMatrix[i][j] = j;
                }
            }
            return testMatrix;
        }
        return generatorMatrix();
    }

    int[][] getMatrix() {
        return matrix;
    }

    private boolean generatorRow() {
        // 没有完成生成操作
        return false;
    }

}
