/*
猜数字
程序会随机生成一个1- 100的数字。
用户会猜这个数是几，然后程序根据这个数提示大了或者小了，最后猜出来
 */
package basics.unit5;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args){
        final int RESULT = (int)(Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        int in;
        System.out.print("请输入要猜的数字：");
        do {
            in = scanner.nextInt();
            if(in > RESULT){
                System.out.print("你猜的数大了，请重新猜：");
            }else if(in < RESULT){
                System.out.print("你猜的数小了，请重新猜：");
            }
        }while(in != RESULT);
        System.out.print("恭喜你猜对啦！！");

    }
}
