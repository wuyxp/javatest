/*
豆机：
    一个用来做统计的实验的设备，是一个三角形状的均匀放置钉子，
    球都是从板子口落下，每当球碰到钉子，它就有50%的机会落向左边或者右边，
    输入一个瓶子的层数
    输入要扔出去几个球
    理论上这个分布是个正态分布
 */
package unit7;

import java.util.Arrays;
import java.util.Scanner;

public class BeanMachine {
    public static void main(String[] args) {
        // true 为向左，false 为向右
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入这个三角豆机总共有多少层：");
        int size = scanner.nextInt();
        System.out.print("请输入要扔多少个豆子：");
        int count = scanner.nextInt();
        int length = size + 1;
        int[] disc = new int[length];
        Arrays.fill(disc, 0);
        for (int i = 0; i < count; i++) {
            ++disc[path(size)];
        }
        System.out.println(Arrays.toString(disc));
    }

    private static int singlePath() {
        return (Math.random() > 0.5) ? 1 : -1;
    }

    private static int path(int size) {
        double index = (size + 1) / 2;
        for (int i = 0; i < size; i++) {
            index = index + singlePath() * 0.5;
        }
        if (index % 1 == 0) {
            return (int) index;
        } else {
            return (int) (index + singlePath() * 0.5);
        }
    }

    ;
}
