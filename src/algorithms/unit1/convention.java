package algorithms.unit1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class convention {
    /*
    * 求最大公约数
    * 欧几里得算法
    * 计算两个非负整数p和q的最大公约数；
    * 若q是0，则最大公约数是p。
    * 否则，将p除以q得到余数r，
    * p和q的最大公约数即为q和r的最大公约数
    * */

    public static int getConvention(int p, int q){
        if(q == 0){
            return p;
        }
        return getConvention(q, p % q);
    };
    public static void main(String[] args) {

        while(true){
            StdOut.println("请输入一个正整数：");
            int p = StdIn.readInt();
            StdOut.println("请再输入一个正整数：");
            int q = StdIn.readInt();
            int r = getConvention(p, q);

            StdOut.printf("%d和%d的最大公约数是%d \n", p, q, r);
        }
    }
}
