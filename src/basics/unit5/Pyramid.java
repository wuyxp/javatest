/*
输入一个数字，然后打印出对应大小的金字塔
比如输入
    4
那么输出
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
 */
package basics.unit5;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个金字塔的高度：");
        int height = scanner.nextInt();
        for(int i=1; i<=height;i++){
            for(int j=0;j<(height-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.printf("%d ",j);
            }
            for(int j=1;j<i;j++){
                System.out.printf("%d ",j+1);
            }
            System.out.print("\n");
        }
    }
}
