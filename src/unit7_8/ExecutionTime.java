/*
随机产生100 000 个整数值和一个关键字，
分别估算一下
    使用线性查找这个关键字所用的时间
    先排序，然后再使用二分查找所用的时间
时间差使用调用两次System.currentTimeMillis();来计算
 */
package unit7_8;

import java.util.Arrays;

public class ExecutionTime {
    public static void main(String[] args) {
        final int M = 100000;
        final int search = randomNum(M);
        int[] arr = makeArr(M, M);
        int index = -1;

        long sortStartTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long endStartTime = System.currentTimeMillis();
        System.out.println("排序所需要的时间："+(endStartTime-sortStartTime));

        long linearSearchStartTime = System.currentTimeMillis();
        index = linearSearch(arr, search);
        long linearSearchEndTime = System.currentTimeMillis();
        log("线性查询", search, index, linearSearchEndTime - linearSearchStartTime);
        System.out.println("");
        long binarySearchStartTime = System.currentTimeMillis();

        index = binarySearch(arr, search);
        long binarySearchEndTime = System.currentTimeMillis();
        log("二分查询", search, index, binarySearchEndTime - binarySearchStartTime);


    }

    private static void log(String s, int value, int index, long millis) {
        System.out.printf("使用%s方法进行要查询的数是%d，它的索引是%d，所花费的时间是%d。", s, value, index, millis);
    }

    private static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length-1;
        boolean isDone = false;
        int index = -1;
        while (!isDone) {
            int middle = (int) ((end + start) / 2);
            if (middle == start) {
                if (arr[start] == value) {
                    index = start;
                }
                if (arr[end] == value) {
                    index = end;
                }
                isDone = true;
            } else {
                int middleValue = arr[middle];
                if (value == middleValue) {
                    index = middle;
                    isDone = true;
                } else if (value > middleValue) {
                    start = middle;
                } else {
                    end = middle;
                }
            }
        }
        return index;
    }

    private static int randomNum(int max) {
        return (int) (Math.random() * max);
    }

    private static int[] makeArr(int length, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = randomNum(max);
        }
        return arr;
    }

}
