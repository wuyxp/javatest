/*
正多边形是一个n条边的多边形，它每条边的长度都相等，每个角的角度也相等，计算这个正多边形的面积的公式是

    area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n))
    其中 n是边的个数，s是边长
用户需要输入n和s，那么我们就要计算出来
 */
package unit4;

import java.util.Scanner;

public class ComputeAreaRegularPolygon {
    public static void main(String[] agre){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多边形的边数：");
        int n = scanner.nextInt();

        System.out.println("请输入多边形的边长：");
        double s = scanner.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("计算出来的面积是%f", area);
    }
}
