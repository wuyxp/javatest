package unit10;

/*
MyPoint类，表示带x坐标和y坐标的点
1.两个带get方法的数据域x和y分别表示它们的坐标
2.一个创建点(0,0)的无参构造方法
3.一个创建特定坐标点的构造方法
4.一个名为distance的方法，返回从该点到MyPoint类型的指定点之间的距离
5.一个名为distance的方法。返回从该店到指定x和y坐标的指定点之间的距离
 */
public class MyPoint {
    private double x;
    private double y;

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    MyPoint() {
        this(0, 0);
    }

    double distance(double x, double y) {
        return Math.pow((Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)), .5);
    }

    double distance(MyPoint p) {
        return this.distance(p.x, p.y);
    }
}
