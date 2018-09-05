package unit1_3;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] agrs){
        double radius;
        double area;
        final double PI = 3.15926;

        System.out.println("请输入半径的长度：");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        double perimeter = 2 * PI * radius;
        area = radius * radius * PI;
        System.out.println("这是计算圆的面积");
        System.out.println("半径是："+radius);
        System.out.println("圆的面积是："+area);
        System.out.println("圆的周长是："+perimeter);
    }
}
