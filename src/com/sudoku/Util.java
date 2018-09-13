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

    static boolean checkMatrixRow(int[][] matrix, int rowIndex, int colIndex, int value) {
        int[][] resultMatrix = Util.getAllRow(matrix);
        return checkRow(resultMatrix[rowIndex], value);
    }

    static boolean checkMatrixCol(int[][] matrix,int rowIndex, int colIndex, int value) {
        int[][] resultMatrix = Util.getAllCol(matrix);
        return checkRow(resultMatrix[colIndex], value);
    }

    static boolean checkMatrixCell(int[][] matrix, int rowIndex, int colIndex, int value) {
        int[][] resultMatrix = Util.getAllCell(matrix);
        int cellIndex = (rowIndex / 3) *3+ (colIndex/3) *3;
        return checkRow(resultMatrix[cellIndex], value);
    }

    // 检查九宫格是否合格
    static boolean checkMatrix(int[][] matrix, int rowIndex, int colIndex, int value) {
        return (
                checkMatrixRow(matrix, rowIndex, colIndex, value) &&
                        checkMatrixCol(matrix, rowIndex, colIndex, value) &&
                        checkMatrixCell(matrix, rowIndex, colIndex, value)
        );
    }
    // 生成一行1-9的数组
    static int[] generatorRow() {
        int[] arr = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // 洗牌算法
    static int[] shuffle(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * 9);
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        return result;
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
