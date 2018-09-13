package unit10;

import java.util.Scanner;

/*
检测一个字符串在忽略即时非字母又是非数字的字符时是否是一个回文传
这里需要注意，要过滤里面的非数字和字符
或者需要创造一个可以变长的StringBuilder类
 */
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String s = scanner.next();
        scanner.close();
        String result = ignoreNonAlphanumeric(s);
        System.out.println("源字符串是" + result);
        String rs = revertString(result);
        System.out.println("经过翻转后的字符串是：" + rs);
        if (result.equals(rs)) {
            System.out.println("字符串经过过滤后是回文传");
        } else {
            System.out.println("不是回文传");
        }

    }

    private static String ignoreNonAlphanumeric(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    private static String revertString(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(arr[length - i - 1]);
        }
        return sb.toString();
    }
}
