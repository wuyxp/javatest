/*
输入一个10进制的数，转换成16进制的字符串
 */
package basics.unit5;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个10进制的数字：");
        final int SCALE = 16;
        int num = scanner.nextInt();
        String result = "";
        int tmp;
        while(num != 0){
            tmp = (num % SCALE);
            char c;
            if(tmp > 9){
                c = (char)(tmp-10+'A');
            }else{
                c = (char)(tmp+'0');
            }
            result = c + result;
            num = num / SCALE;
        }
        System.out.printf("计算出来的16进制是%s", result);
    }
}
