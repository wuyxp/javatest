/*
检查密码的有效性
    密码必须是8位字符
    密码仅能包含字母和数字
    密码必须包含至少两个数字
 */
package unit6;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个密码：");
        String password = scanner.next();
        if (!checkLength(password)) {
            System.out.printf("密码长度位数不对！");
            return;
        }
        if (!checkValidity(password)) {
            System.out.printf("密码格式不对！");
            return;
        }
        System.out.printf("密码合法");
    }

    private static boolean checkLength(String s) {
        return s.length() == 8;
    }

    private static boolean checkValidity(String s) {
        int numberLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!checkCharOfLetter(c)) {
                if (!checkCharOfNum(c)) {
                    return false;
                }
                numberLength++;
            }
        }
        return numberLength > 1;
    }

    private static boolean checkCharOfNum(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean checkCharOfLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
