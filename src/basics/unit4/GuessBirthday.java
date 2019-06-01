/*
有5组日历，然后分别询问，生日是不是其中的一天，如果是，打1，如果不是打0，那么最后就可以获取到这个生日

set1
    1  3  5  7
    9 11 13 15
   17 19 21 23
   25 27 29 31

set2
    2  3  6  7
   10 11 14 15
   18 19 22 23
   26 27 30 31

set3
    4  5  6  7
   12 13 14 15
   20 21 22 23
   28 29 30 31

set4
    8  9 10 11
   12 13 14 15
   24 25 26 27
   28 29 30 31

set5
   16 17 18 19
   20 21 22 23
   24 25 26 27
   28 29 30 31


原理也简单：
    假设输入5次0 和 1 组成一个5位数的2进制，比如 10010 。那么就吧位数为1的第一位数加起来，得到的和就是这个生日。这5组数也不是随机选的，是根据所有在这个位置上是1的数字分配的。
    比如第一组，如果换算成二进制，那么是 00001 00010 00100 01000 ... ，如果是第4组，那么是回头再想，先写程序.
 */
package basics.unit4;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] arge){
        String set1 =
                "    1  3  5  7\n" +
                "    9 11 13 15\n" +
                "   17 19 21 23\n" +
                "   25 27 29 31";
        String set2 =
               "    2  3  6  7\n" +
               "   10 11 14 15\n" +
               "   18 19 22 23\n" +
               "   26 27 30 31" ;
        String set3 =
                "    4  5  6  7\n" +
                "   12 13 14 15\n" +
                "   20 21 22 23\n" +
                "   28 29 30 31";
        String set4 =
                "    8  9 10 11\n" +
                "   12 13 14 15\n" +
                "   24 25 26 27\n" +
                "   28 29 30 31";
        String set5 =
                "   16 17 18 19\n" +
                "   20 21 22 23\n" +
                "   24 25 26 27\n" +
                "   28 29 30 31 ";
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(set1);
        System.out.println("请查看是否在第一组中，如果有则打1，如果没有则打0：");
        if(scanner.nextInt() == 1){
            day +=1;
        }

        System.out.println(set2);
        System.out.println("请查看是否在第二组中，如果有则打1，如果没有则打0：");
        if(scanner.nextInt() == 1){
            day +=2;
        }

        System.out.println(set3);
        System.out.println("请查看是否在第三组中，如果有则打1，如果没有则打0：");
        if(scanner.nextInt() == 1){
            day +=4;
        }

        System.out.println(set4);
        System.out.println("请查看是否在第四组中，如果有则打1，如果没有则打0：");
        if(scanner.nextInt() == 1){
            day +=8;
        }

        System.out.println(set5);
        System.out.println("请查看是否在第五组中，如果有则打1，如果没有则打0：");
        if(scanner.nextInt() == 1){
            day +=16;
        }
        System.out.println("那么你的生日是"+ day+"号");
    }
}
