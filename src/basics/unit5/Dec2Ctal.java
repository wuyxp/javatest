/*
输入一个数字，再输入一个进制，
然后根据进制换算出来这个数字，并且展示出来
 */
package basics.unit5;

import java.util.Scanner;

public class Dec2Ctal {
    public static String dec(int num, int ctal){
        String result ="";
        // 这里做进制转换
        while(num != 0){
            int tmp = num % ctal;
            num = num / ctal;
            char c;
            if(tmp > 9){
                c = (char)(tmp - 10 + 'A');
            }
            else{
                c = (char)(tmp + '0');
            }
            result = c + result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean go = true;
        while(go){
            System.out.print("请输入要转换的数字：");
            int num = scanner.nextInt();
            System.out.print("请输入要转换的进制：");
            int ctal = scanner.nextInt();
            while(ctal < 2 || ctal > 32){
                System.out.print("输入的进制不符(2-32)请重新输入：");
                ctal = scanner.nextInt();
            }
            String result = dec(num, ctal);
            System.out.printf("经过换算得到的的结果是%s\n", result);
            System.out.print("是否还想进行换算？（y or n）");
            String s = scanner.next();
            if(s.equalsIgnoreCase("Y")){
                go = true;
            }else{
                go = false;
            }
        }

    }
}
