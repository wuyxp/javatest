package unit9;

import java.util.Arrays;
import java.util.Scanner;

/*
编写一个Location的类
定位二维数组的中的最大值及其位置
这个类包括公用区域 int row,int column,double maxValue
    public static Location locateLargest(double[][] a)
返回值是一个Location的实例。
编写测试程序，提示用户输入一个二维数组，然后显示这个最大元素的位置。
 */
public class SimpleLocation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要创建表格的行列用空格分开：");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        Location location = new Location(row, col);
        for (int i = 0; i < row; i++) {
            System.out.printf("请输入第%d行的数据：", i);
            double[] rows = new double[col];
            for (int j = 0; j < col; j++) {
                rows[j] = scanner.nextDouble();
            }
            location.setRow(i, rows);
        }
        System.out.println("获取的矩阵是：");
        location.printMatrix();
        double[] maxValue = location.getMaxValues();
        System.out.printf("矩阵的最大值是%f，其位置是（%d，%d）", maxValue[0], (int) maxValue[1], (int) maxValue[2]);

    }
}

class Location {
    int row;
    int column;
    double[] maxValues = new double[3];
    double[][] matrix;

    Location(int row, int col) {
        this.row = row;
        this.column = col;
        this.matrix = new double[row][col];
    }

    Location() {
        this.row = 3;
        this.column = 4;
    }

    private void setMaxValues() {
        double maxv = 0;
        double maxx = -1;
        double maxy = -1;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (this.matrix[i][j] > maxv) {
                    maxv = this.matrix[i][j];
                    maxx = i;
                    maxy = j;
                }
            }
        }
        this.maxValues[0] = maxv;
        this.maxValues[1] = maxx;
        this.maxValues[2] = maxy;
    }

    double[] getMaxValues() {
        return maxValues;
    }

    void setRow(int index, double[] row) {
        this.matrix[index] = row;
        this.setMaxValues();
    }

    void printMatrix() {
        System.out.println("---------------------------");
        for (int i = 0; i < this.row; i++) {
            System.out.println(Arrays.toString(this.matrix[i]));
        }
        System.out.println("---------------------------");
    }
}


