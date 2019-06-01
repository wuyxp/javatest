package algorithms.unit1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class transform2 {
    public static void main(String[] args) {
        while (true){
            StdOut.println("请输入一个正整数");
            int n = StdIn.readInt();
            String str = "";
            int m = n;
            while (m >= 1){
                String c = String.valueOf((m % 2));
                str = c + "" + str;
                m = m / 2;
            }
            StdOut.printf("%d的二进制数是%s",n, str);
            StdOut.println();
        }
    }
}
