/*
测试生成随机字符串
 */
package basics.unit6;

import java.util.Scanner;

public class TextRandomCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要生成什么样类型的字符串：（1：[A-Z]，2：[a-z]，3：[0-9]，可以混合输入比如12，123，23）：");
        String type = scanner.next();
        while (!isType(type)) {
            type = scanner.next();
        }
        System.out.print("请输入生成多少位的随机数：");
        int numLength = scanner.nextInt();
        String result = "";
        for (int i = 0; i < numLength; i++) {

            result += getRandom(type);
        }
        System.out.println("生成的结果是：" + result);

    }

    public static char getRandom(String type) {
        int length = type.length();
        int r = (int) (Math.random() * length);
        char c = type.charAt(r);
        if (c == '1') {
            return RandomCharacter.getRandomChar("UpperCase");
        } else if (c == '2') {
            return RandomCharacter.getRandomChar("LowerCase");
        } else {
            return RandomCharacter.getRandomChar("Digit");
        }
    }

    public static boolean isType(String s) {
        int l = s.length();
        if (l > 3 || l < 1) {
            System.out.println("输入的类型位数不对请重新输入(1到3位)：");
            return false;
        }
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) > '3' || s.charAt(i) < '1') {
                System.out.println("输入的格式不对请重新输入([123]的组合)：");
                return false;

            }
        }
        return true;
    }
}
