package unit10;

/*
测试三角形类
new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5)) 创建这个对象t1
显示这个周长和面积
并显示
t1.contains(3, 3)
t1.contains(new Triangle2D(new MyPoint(2.9, 2)), new MyPoint(4.1), new MyPoint(1, 3.4))
t1.overlaps(new Triangle2D(new MyPoint(2, 5.5)), new MyPoint(4. -3), new MyPoint(2, 6.5)))
 */
public class TestTriangle2D {
    public static void main(String[] args) {
        Triangle2D t0 = new Triangle2D();
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));

        System.out.println("t0的周长是：" + t0.getPerimeter() + "。t0的面积是是：" + t0.getArea());
        System.out.println("t1的周长是：" + t1.getPerimeter() + "。t1的面积是是：" + t1.getArea());

        System.out.println(t1.contains(3, 3));
        System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
    }
}
