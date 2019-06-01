package basics.unit10;
/*
大数据的阶乘计算，这里注意一个整数的阶乘会非常大
这里利用两个可以表示任意整形的类
BigInteger
BigDecimal
 */

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args){
        System.out.println("请输入一个数，我会计算出这个数的阶乘：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        BigInteger result = BigInteger.ONE;
        for(int i=1;i<=num;i++){
            result = result.multiply(new BigInteger(i+""));
        }
        System.out.println("计算出的阶乘是："+result);
    }
}
