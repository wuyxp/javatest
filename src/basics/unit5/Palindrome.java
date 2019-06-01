/*
输入一个字符串判断该字符是否为回文字符串
 */
package basics.unit5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = scanner.next();
        for(int i=0, l=s.length()-1; i<l; i++,l--){
            if(s.charAt(i) != s.charAt(l)){
                System.out.printf("%s不是回文字符串",s);
                System.exit(0);
            }
        }
        System.out.printf("%s是回文字符串",s);
        System.exit(0);
    }
}



