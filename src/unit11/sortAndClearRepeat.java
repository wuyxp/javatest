package unit11;

import java.util.ArrayList;
import java.util.Scanner;

/*
对ArrayList
进行排序，去重
 */
public class sortAndClearRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组，第一位是数组的长度：");
        int length = scanner.nextInt();
        ArrayList list = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            list.add(new Integer(scanner.nextInt()));
        }
        scanner.close();
        System.out.println("获取下来的数组是：");
        System.out.println(list);
        System.out.println("去重后的数组是：");
        System.out.println(clearRepeat(list));
        System.out.println("使用快排后的数组是：");
        System.out.println(sort(list));
    }

    public static ArrayList clearRepeat(ArrayList list) {
        ArrayList result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            result.add(o);
            if (list.indexOf(o) != list.lastIndexOf(o) && result.indexOf(o) != result.lastIndexOf(o) ) {
                result.remove(o);
            }
        }
        return result;
    }

    public static ArrayList sort(ArrayList list) {
         return quickSort(list);
    }

    public static ArrayList quickSort(ArrayList list) {
        if (list.size() <= 1) {
            return list;
        }
        int BaseIndex = (int) list.get(0);
        ArrayList leftArr = new ArrayList();
        ArrayList rightArr = new ArrayList();

        for (int i = 1; i < list.size(); i++) {
            Object o = list.get(i);
            if ((int) o < BaseIndex) {
                leftArr.add(o);
            } else {
                rightArr.add(o);
            }
        }
        ArrayList result = new ArrayList();
        result.addAll(quickSort(leftArr));
        result.add(list.get(0));
        result.addAll(quickSort(rightArr));

        return result;
    }

}
