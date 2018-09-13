package com.sudoku;

public class TestSudoku {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int[][] matrix = sudoku.generatorMatrix();

        System.out.println("所有矩阵行是：");
        Util.printMatrix(matrix);

        System.out.println("所有矩阵列是：");
        int[][] colMatrix = Util.getAllCol(matrix);
        Util.printMatrix(colMatrix);

        System.out.println("所有宫阵列是：");
        int[][] cellMatrix = Util.getAllCell(matrix);
        Util.printMatrix(cellMatrix);


    }
}
