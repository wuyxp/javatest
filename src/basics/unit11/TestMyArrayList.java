package basics.unit11;

import java.util.Scanner;

/*
对ArrayList
进行排序，去重
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组，第一位是数组的长度：");
        int length = scanner.nextInt();
        MyArrayList list = new MyArrayList(length);
        for (int i = 0; i < length; i++) {
            list.add(new Integer(scanner.nextInt()));
        }
        System.out.println("获取下来的数组是：");
        System.out.println(list);
        System.out.println("去重后的数组是：");
        System.out.println(list.clearRepeat());
        System.out.println("使用快排后的数组是：");
        System.out.println(list.sort());

    }



}
