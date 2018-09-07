/*
10进制转8进制
 */
package unit5;

import java.util.Scanner;

public class Dec2Octal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SCALE = 8;
        System.out.print("请输入一个10进制数字：");
        int num = scanner.nextInt();
        String ctal = "";
        while(num != 0){
            int c = (num % SCALE);
            ctal = c + ctal;
            num = num / SCALE;
        }
        System.out.printf("经过转换到8进制的结果是%s",ctal);
    }
}
