package basics.unit9;

import java.util.Random;
import java.util.Scanner;

/*
随机出来几个圆，然后生成一个表，输出圆半径和面积
 */
public class TotalArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要制作几个圆：");
        int total = scanner.nextInt();
        CircleWithPrivateDataFields[] circles = createCircleWithPrivateDataFields(total);
        printCircles(circles);
    }

    private static CircleWithPrivateDataFields[] createCircleWithPrivateDataFields(int total) {
        CircleWithPrivateDataFields[] circles = new CircleWithPrivateDataFields[total];
        Random r = new Random();
        for (int i = 0; i < total; i++) {
            CircleWithPrivateDataFields c = new CircleWithPrivateDataFields();
            circles[i] = c;
            double radius = r.nextInt(100);
            c.setRadius(radius);
        }
        return circles;
    }

    private static void printCircles(CircleWithPrivateDataFields[] c) {
        System.out.printf("%-30s%-15s\n", "半径", "面积");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%-30f%-15f\n", c[i].getRadius(), c[i].getArea());
        }

    }

}
