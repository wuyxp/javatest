/*
使用二分查找来查找数组里某个值得下标，如果没有则返回-1
考虑下面三种情况：
1.如果关键字小于中间元素，只需要在数组的前一半元素中继续查找关键字
2.如果关键字和中间元素相等，则匹配成功，查找结束
3.如果关键字大于中间元素，只需要在数组的后一半元素中继续查找关键字
注意：二分法查找必须使数组有序排列
如果无序，则可以使用Array.sort()静态方法处理
 */
package unit7_8;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 89, 23, 5, 5, 3, 43, 5};
        int result = 4;
        int resultIndex = -1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int start = 0;
        int end = array.length - 1;
        boolean flag = true;
        while (start < (end) && resultIndex == -1 && flag) {
            if (start == end) {
                flag = false;
            } else if (start == (end - 1)) {
                if (array[start] == result) {
                    resultIndex = start;
                } else if (array[end] == result) {
                    resultIndex = end;
                }
                flag = false;
            } else {
                int middle = (int) ((start + end) / 2);
                if (array[middle] == result) {
                    resultIndex = middle;
                } else if (array[middle] > result) {
                    end = middle;
                } else {
                    start = middle;
                }
            }
        }
        System.out.println("从" + Arrays.toString(array) + "中查找" + result + "的结果索引是：" + resultIndex);
    }
}
