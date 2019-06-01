/*
提示用户输入两个城市，然后根据字母表的顺序进行显示
 */
package basics.unit4;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] agre){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个城市中间用空格隔开：");
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println("您输入的两个城市分别是："+s1+"，"+s2);

        String sort;
        if(s1.compareTo(s2) > 0){
            sort = s1+"，"+s2;
        }else{
            sort = s2+"，"+s1;
        }
        System.out.println("经过排序的城市是"+sort);

    }
}
