/*
八皇后：
    将八个皇后放到棋盘上（8 * 8）
    任何两个皇后都不能互相攻击
        没有两个皇后在同一行，同一列或者同一对角
 */
package basics.unit7_8;

import java.util.Arrays;

public class EightQueen {
    public static void main(String[] agrs) {
        final int M = 8;
        int[][] board = initArray(M);
        for (int i = 0; i < M; i++) {
            boolean isDone = false;
            int index = indexOf(board[i], 1) + 1;
            for (int j = index; j < M; j++) {
                setQueen(board, i, j);
                if (checkRow(board, i, j) && checkDia(board, i, j)) {
                    isDone = true;
                    break;
                }
            }
            if (!isDone) {
                Arrays.fill(board[i], 0);
                i = i - 2;
            }

        }
        for (int i = 0; i < M; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    private static int indexOf(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void setQueen(int[][] array, int row, int col) {
        Arrays.fill(array[row], 0);
        array[row][col] = 1;
    }

    private static boolean checkRow(int[][] array, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (array[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDia(int[][] array, int row, int col) {
        int length = array.length;
        for (int i = 0; i < row; i++) {
            int diffRow = row - i;
            int diffColMinus = col - diffRow;
            int diffColPlus = col + diffRow;
            if (diffColMinus < 0 && diffColPlus >= length) {
                continue;
            } else {
                if (diffColMinus >= 0 && array[i][diffColMinus] == 1) {
                    return false;
                }
                if (diffColPlus < length && array[i][diffColPlus] == 1) {
                    return false;
                }
            }

        }
        return true;
    }

    private static int[][] initArray(int size) {
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(board[i], 0);
        }
        return board;
    }
}
