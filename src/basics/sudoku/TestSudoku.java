package basics.sudoku;

import basics.sudoku.model.Sudoku;
import basics.sudoku.model.Util;
import basics.sudoku.view.Dashboard;
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
