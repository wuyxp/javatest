public class Epsilon {
    public static void main(String[] arge){
        System.out.println("我们要测试一下看一看0.1+0.2");
        System.out.println("0.1+0.2="+(0.1+0.2));
        System.out.println("怎么才能让0.1+0.2=0.3");

        final double EPSILON = 1E-14;
        if(Math.abs((0.1+0.2) - 0.3)<EPSILON){
            System.out.println("两个数的差值很近，几乎一样");
        }else{
            System.out.println("不相等");
        }
    }
}
