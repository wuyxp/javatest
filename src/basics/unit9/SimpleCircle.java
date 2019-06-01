/*
设置一个Circle类，可以设置半径并且获取圆的面积
 */
package basics.unit9;

public class SimpleCircle {
    public static void main(String[] args) {
        BaseCircle c1 = new BaseCircle();
        System.out.printf("默认情况下半径为%f的圆的面积是：%f,周长是%f\n", c1.radius, c1.getArea(), c1.getPerimete());
        BaseCircle c2 = new BaseCircle(2.5);
        System.out.printf("将半径设置为%f的圆的面积是%f，周长是%f\n", c2.radius, c2.getArea(), c2.getPerimete());

    }
}


