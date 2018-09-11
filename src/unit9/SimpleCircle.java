/*
设置一个Circle类，可以设置半径并且获取圆的面积
 */
package unit9;

public class SimpleCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.printf("默认情况下半径为%f的圆的面积是：%f,周长是%f\n", c1.radius, c1.getArea(), c1.getPerimete());
        Circle c2 = new Circle(2.5);
        System.out.printf("将半径设置为%f的圆的面积是%f，周长是%f\n", c2.radius, c2.getArea(), c2.getPerimete());

    }
}

class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimete() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double r) {
        radius = r;
    }
}
