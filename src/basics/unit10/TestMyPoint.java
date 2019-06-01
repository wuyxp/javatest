package basics.unit10;

/*
测试MyPoint类
(0,0)
(10,30.5)
显示它们的距离
 */
public class TestMyPoint {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("两个点之间的距离是："+p1.distance(p2));
    }
}
