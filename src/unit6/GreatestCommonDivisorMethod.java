/*
输入两个整数，获取两个整数的最大公约数
 */
package unit6;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int result = gcd(num1, num2);
        System.out.printf("两个数的最大公约数是%d", result);

    }
    private static int gcd(int n1, int n2){
        int result = 1;
        int i = 1;
        while(i<=n1 && i<= n2){
            if(n1 % i == 0 && n2 % i == 0){
                result = i;
            }
            i++;
        }
        return result;
    }
}
