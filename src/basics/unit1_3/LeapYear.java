package basics.unit1_3;

import java.util.Scanner;

/*
判断闰年
如果某年能被4整除而不能被100整除，或者可以被400整除，那么这一年就是闰年
 */
public class LeapYear {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个年份");
        long year = scanner.nextLong();

        String log;
        if( (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0) ){
            log = year + "是闰年";
        }else{
            log = year + "不是闰年";
        }
        System.out.println(log);
    }
}
