package unit7_8;
/*
使用递归方式生成一个数独
然后打印出来
可以使用类
 */

import sun.rmi.runtime.Log;

public class SudokuSolution {
    public static void main(String[] args){

    }
}

class Sudoku{
    final static int LENGTH = 9;
    private int[][] matrix = new int[LENGTH][LENGTH];

    Sudoku(){

    }
    int[][] generatorMatrix(){
        int[][] gMatrix = new int[LENGTH][LENGTH];

        return gMatrix;
    }
    int[][] getMatrix(){
        return matrix;
    }

    private boolean generatorRow(){
        // 没有完成生成操作
        return false;
    }
}
class Util{
    final static int LENGTH = 9;

    private static boolean checkRow(int[] row, int value){
        for(int i=0;i<row.length;i++){
            if(row[i] == value){
                return false;
            }
        }
        return true;
    }
    static boolean checkMatrixRow(int[][] matrix, int rowIndex, int value){
        int[] row = matrix[rowIndex];
        return checkRow(row, value);
    }
    static boolean checkMatrixCol(int[][] matrix, int colIndex, int value){
        int[] col = new int[LENGTH];
        for(int i=0;i<matrix.length;i++){
            col[i] = matrix[i][colIndex];
        }
        return checkRow(col, value);
    }
    static boolean checkMatrixCell(int[][] matrix, int cellIndex, int value){
        int[] cell = new int[LENGTH];
        int rowTmp = (cellIndex/3);
        int colTmp = cellIndex%3;
        int cellTmpIndex = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if((i/3) == rowTmp && (j/3) ==colTmp){
                   cell[cellTmpIndex++] = matrix[i][j];
               }
            }
        }
        return checkRow(cell, value);
    }
}