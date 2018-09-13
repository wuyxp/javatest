package com.sudoku;

import java.util.Arrays;

public class Util {
    final static int LENGTH = 9;

    private static boolean checkRow(int[] row, int value) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == value) {
                return false;
            }
        }
        return true;
    }

    static boolean checkMatrixRow(int[][] matrix, int rowIndex, int value) {
        int[] row = matrix[rowIndex];
        return checkRow(row, value);
    }

    static boolean checkMatrixCol(int[][] matrix, int colIndex, int value) {
        int[] col = new int[LENGTH];
        for (int i = 0; i < matrix.length; i++) {
            col[i] = matrix[i][colIndex];
        }
        return checkRow(col, value);
    }

    static boolean checkMatrixCell(int[][] matrix, int cellIndex, int value) {
        int[] cell = new int[LENGTH];
        int rowTmp = (cellIndex / 3);
        int colTmp = cellIndex % 3;
        int cellTmpIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i / 3) == rowTmp && (j / 3) == colTmp) {
                    cell[cellTmpIndex++] = matrix[i][j];
                }
            }
        }
        return checkRow(cell, value);
    }


    // 获取矩阵行
    static int[][] getAllRow(int[][] matrix) {
        return matrix;
    }

    static int[][] getAllRow(Sudoku t) {
        return getAllRow(t.getMatrix());
    }

    // 获取矩阵列
    static int[][] getAllCol(int[][] matrix) {
        int[][] result = new int[LENGTH][LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    static int[][] getAllCol(Sudoku t) {
        return getAllCol(t.getMatrix());
    }

    // 获取宫矩阵
    static int[][] getAllCell(int[][] matrix) {
        int[][] result = new int[LENGTH][LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                result[i][j] = matrix[(i / 3) * 3][(j % 3) + (i % 3) * 3];
            }
        }
        return result;
    }

    static int[][] getAllCell(Sudoku t) {
        return getAllCell(t.getMatrix());
    }

    // 输出矩阵
    static void printMatrix(int[][] matrix) {
        System.out.println("--------当前的矩阵是--------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("-------矩阵输入结束---------\n\n");

    }

    static void printMatrix(Sudoku t) {
        printMatrix(t.getMatrix());
    }

}
