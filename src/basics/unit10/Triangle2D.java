package basics.unit10;

/*
1.三个名为p1，p2，p3的MyPoint类型的数据域，这三个数据类型都带有get和set方法
2.一个无参构造方法，该方法创建三个坐标为(0,0)(1,1)(2,5)的点组成的默认三角形
3.一个创建带指定点的三角形构造方法
4.一个返回三角形面积的方法getArea()
5.一个返回三角形周长的方法getPerimeter()
6.如果给定点p在这个三角形内，那么方法contains(MyPoint p)返回true
7.如果给定的三角形在这个三角形内，那么方法contains(Triangle2D t)返回true
8.如果给定的三角形和这个三角形重叠，那么方法overlaps(Triangle2D t)返回true

**
如果点在三角形中，每条虚线应该和边相交一次，如果虚线和边相交两次，那么这个点肯定在这个三角形外。
 */
public class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    private double s1, s2, s3;

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        initSize();
    }

    Triangle2D() {
        this(new MyPoint(), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    void initSize() {
        this.s1 = this.p1.distance(this.p2);
        this.s2 = this.p1.distance(this.p3);
        this.s3 = this.p2.distance(this.p3);
    }

    double getPerimeter() {
        return this.s1 + this.s2 + this.s3;
    }

    double getArea() {
        double p;
        p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.s1) * (p - this.s2) * (p - this.s3));
    }

    boolean contains(MyPoint p) {
        double s = this.getArea();
        // 根据面积比较来判断点是否在三角形内部
        double s1 = new Triangle2D(this.p1, this.p2, p).getArea();
        double s2 = new Triangle2D(this.p3, this.p2, p).getArea();
        double s3 = new Triangle2D(this.p1, this.p3, p).getArea();
        return s < (s1 + s2 + s3);
    }

    boolean contains(int x, int y) {
        return this.contains(new MyPoint(x, y));
    }

    boolean contains(Triangle2D t) {
        return this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3());
    }

    boolean overlaps(Triangle2D t) {
        return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3());
    }


    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }
}
