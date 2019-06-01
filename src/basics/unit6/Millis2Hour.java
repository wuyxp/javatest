/*
将一个毫秒数转换成小时数
 */
package basics.unit6;

import java.util.Scanner;

public class Millis2Hour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个毫秒数：");
        long millis = scanner.nextLong();
        String result = convertMillis(millis);
        System.out.print("换算后的结果是"+result);
    }
    public static String convertMillis(long millis){
        String s = "";
        long second = millis / 1000;
        int mill = (int)(millis % 1000);
        int sec = (int)(second % 60);
        long minute = second / 60;
        int min = (int)(minute % 60);
        long hour = minute / 60;
        s = hour + "："+min+"："+sec+"："+mill;
        return s;
    }
}
