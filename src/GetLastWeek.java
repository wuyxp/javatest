import java.util.Scanner;

public class GetLastWeek {
    public static void log(String arge){
        System.out.println(arge);
    }
    public static int getWeek(int today, int future){
        int result = (today + future);
        return result % 7;
    }
    public static void main(String[] arge){
        log("请输入今天是周几：");
        int today = new Scanner(System.in).nextByte();
        log("请输入想算几天后：");
        int future = new Scanner(System.in).nextInt();
        log("那么计算结果是："+future+"天后是星期"+getWeek(today, future));

    }
}
