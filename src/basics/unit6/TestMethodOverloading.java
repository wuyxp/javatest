/*
定义三个方法获取最大值，用来测试方法重载
 */
package basics.unit6;

public class TestMethodOverloading {
    public static void main(String[] args){
        int n1 = 3, n2 = 2;
        System.out.println(n1+"和"+n2+"进行比较"+max(n1, n2));
        double d1 = 3.5, d2 = 2.9;
        System.out.println(d1+"和"+d2+"进行比较"+max(d1, d2));
        char s1 = 'A', s2 = 'B';
        System.out.println(s1+"和"+s2+"进行比较"+max(s1, s2));
    }
    private static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
    private static double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }
    private static char max(char n1, char n2){
        return n1 > n2 ? n1 : n2;
    }
}
