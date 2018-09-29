package com.sudoku;

import com.sudoku.model.Sudoku;
import com.sudoku.model.Util;
import com.sudoku.view.Dashboard;
import javafx.application.Application;

public class TestSudoku extends Dashboard {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int[][] matrix = sudoku.generatorMatrix();

        System.out.println("所有矩阵行是：");
        Util.printMatrix(matrix);
        Application.launch(args);

    }
}
