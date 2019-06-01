package basics.unit9;

/*
设计个正多边形，所有边和角都相等
一个名为n的int型私有数据域定义多边形的边数，默认值是3
一个名为side的double型的私有数据存储域的长度，默认值是1
一个名为x的double型的私有数据域定义多边形中点x的坐标，默认是0
一个名为y的double型的私有数据域定义多边形中点y的坐标，默认值0

一个创建带默认值的正多边形的无参数构造方法
一个能创建带指定边数和边长度，中心在(0,0)的正多边形构造方法
一个能创建带指定边数和边长度，中心在(x,y)的正多边形构造方法

所有数据域的访问器和修改器
一个返回多边形周长的方法getPerimeter()
一个返回多边形面积的方法getArea()

计算正多边形的面积公式是

    area = (n*s*s)/(4*Math.tan(Math.PI/n))

编写测试程序，分别使用无参数构造方法，
RegularPolygon(6, 4)
RegularPolygon(10, 4, 5.6, 7.8)
RegularPolygon()
分别返回周长和面积

 */
public class SimpleRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon[] rps = {
                new RegularPolygon(),
                new RegularPolygon(6, 4),
                new RegularPolygon(10, 4, 5.6, 7.8)
        };

        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "边数", "边长", "圆心", "周长", "面积");
        for (int i = 0; i < rps.length; i++) {
            System.out.printf(
                    "%-20s%-20s%-20s%-20s%-20s\n",
                    rps[i].getN(),
                    rps[i].getSide(),
                    "(" + rps[i].getX() + "，" + rps[i].getY() + ")",
                    rps[i].getPerimeter(),
                    rps[i].getArea()
            );
        }
    }
}

class RegularPolygon {
    int n;
    double side;
    double x;
    double y;

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    RegularPolygon() {
        this(3, 1);
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double getPerimeter() {
        return this.n * this.side;
    }

    double getArea() {
        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }
}

