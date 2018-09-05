package unit1_3;

import java.util.Scanner;

/*
根据用户输入的年份，来返回用户对应的属相
 */
public class ChineseZodiac {
    public static void main(String[] arge){
        System.out.println("请输入你的年龄");
        int year = new Scanner(System.in).nextInt();
        String log = "";
        switch (year % 12){
            case 0:
                log= "猴";
                break;
            case 1:
                log= "鸡";
                break;
            case 2:
                log= "狗";
                break;
            case 3:
                log= "猪";
                break;
            case 4:
                log= "鼠";
                break;
            case 5:
                log= "牛";
                break;
            case 6:
                log= "虎";
                break;
            case 7:
                log= "兔";
                break;
            case 8:
                log= "龙";
                break;
            case 9:
                log= "蛇";
                break;
            case 10:
                log= "马";
                break;
            case 11:
                log= "羊";
                break;
        }
        System.out.println(log);
    }
}
