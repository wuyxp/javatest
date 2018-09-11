package unit9;

import javafx.geometry.Point2D;

import java.util.Scanner;

/*
用来表示二维平面的点
 */
public class TestPoint2D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个点的x，y的坐标：");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("请输入第二个点的x，y的坐标：");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point2D point = new Point2D(x1, y1);
        System.out.println("第一个点的坐标是："+point.toString());
        System.out.println("第一个点到第二个点的距离是："+point.distance(x2, y2));

    }
}
