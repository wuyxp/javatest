/*
输入一个16进制的数，我给你转成10进制的

(int)'A' == 65
(int)'a' == 97
(int)'0' == 48
 */
package unit4;

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] agre){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个16进制的数字");
        String str = scanner.next().toLowerCase();
        int index = 0;
        final int HEX = 16;
        final int ZERO = 48;
        long result = 0;
        for (int l = str.length(),i = l-1; i>=0;i--){
            char s = str.charAt(i);
            if(s > 'f'){
                System.out.println("输入的16进制有误！");
                System.exit(1);
            }
            int n = s >= 'a' ? (s - 'a' + 10) : (int)s - ZERO;
            result += n * Math.pow(HEX, index++);
        }
        System.out.printf("最终转换成10进制为%8d", result);
    }
}
