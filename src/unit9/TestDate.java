package unit9;

import java.util.Date;

/*
测试 Date类
 */
public class TestDate {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(20);
        System.out.println(date);
    }
}
