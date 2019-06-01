/*
校验信用卡的合法性
0、卡号必须是13到16位的整数
1、从左到右对每个数字进行翻倍，如果对某个数字翻倍之后的结果是一个两位数，那么就将这个两个数加一起得到一位数
2、现在讲第一步得到的所有一位数想加
3、将卡号里所有从左到右的奇数位上的所有数字想加
4、将第二步和第三部得到的结果想加
5、如果第四部得到的结果能被10整除，那么卡号是合法的，否则卡号不合法

4388576018402626 不合法
4388576018410707 合法
 */
package basics.unit6;

import java.util.Scanner;

public class CheckCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个卡号：");
        long number = scanner.nextLong();
        if (isValid(number)) {
            System.out.printf("这个卡号它是合法的！");
        } else {
            System.out.printf("这个不合法！！！");
        }

    }

    public static boolean isValid(long number) {
        int sum2 = sumOfDoubleEvenPlace(number);
        int sum3 = sumOfOddPlace(number);
        if ((sum2 + sum3) % 10 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int result = 0;
        String snum = String.valueOf(number);
        for (int i = 0; i < snum.length(); i++) {
            int r = (int) (snum.charAt(i)) * 2;
            if (r > 9) {
                result = r / 10 + r % 10 + result;
            } else {
                result = r + result;
            }
        }
        return result;
    }

    public static int sumOfOddPlace(long number) {
        int result = 0;
        String snum = String.valueOf(number);
        for (int i = 0; i < snum.length(); i++) {
            if (i % 2 == 1) {
                result = result + (int) (snum.charAt(i));
            }
        }
        return result;
    }
}
