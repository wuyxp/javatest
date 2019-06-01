/*
合并两个有序列表
    输入两个有序列表
        这里注意第一个数字表示列表的个数，不能作为列表的一部分
    合并并且输出
    比如
    5 1 5 16 61 111
    4 2 4 5 6
    合并后是
    1 2 4 5 5 6 16 61 111
 */
package basics.unit7_8;

import java.util.Arrays;
import java.util.Scanner;

public class MergeOrderedList {
    public static void main(String[] args) {
        System.out.println("请输入一个序列整形数组，并且第一位是数组的长度：");
        Scanner scanner = new Scanner(System.in);
        int arr1Length = scanner.nextInt();
        int[] arr1 = new int[arr1Length];
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("请再输入一个序列整形数组，并且第一位是数组的长度：");
        int arr2Length = scanner.nextInt();
        int[] arr2 = new int[arr2Length];
        for (int i = 0; i < arr2Length; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] result = sort(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("两个数组排序后的结果是：");
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int arr1Index = 0;
        int arr2Index = 0;
        for (int i = 0; i < length; i++) {
            if (arr1Index >= arr1.length) {
                result[i] = arr2[arr2Index++];
            } else if (arr2Index >= arr2.length) {
                result[i] = arr1[arr1Index++];
            } else {
                if (arr1[arr1Index] < arr2[arr2Index]) {
                    result[i] = arr1[arr1Index++];
                } else {
                    result[i] = arr2[arr2Index++];
                }
            }

        }
        return result;
    }
}
