/*
选择排序
假设要按升序排列一个数列，
选择排序法先找到数列中最小的值，然后将它和第一个元素交换，
接下来，在剩下的数中找到最小的数，将它和第二个元素交换，
以此类推，直到数组剩一个元素为止
 */
package unit7;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4, 2, 6, 9, 5, 1, 8, 3, 7};
        System.out.println("原数组是："+Arrays.toString(arr));
        int start = 0;
        int length = arr.length;
        for(int i =0; i< length; i++){
            start = i+1;
            int min = arr[i];
            int index = i;
            for(; start< length; start++){
                if(arr[start] < min){
                    min = arr[start];
                    index = start;
                }
            }
            if(min < arr[i]){
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
        System.out.println("排好序的数组是："+Arrays.toString(arr));
    }
}
