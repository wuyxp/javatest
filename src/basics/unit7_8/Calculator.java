/*
使用命令行来接受可计算表达式，表达式只能支持+ - * / ，不支持其他
在命令行中执行
    java Calculator 2 + 3
    java Calculator 2 * 3
    java Calculator 2 + 3 * 5
可以返回正确的返回值，* / 的优先级要比+ - 高，参数要按照空格隔开
 */
package basics.unit7_8;

import java.util.Arrays;

public class Calculator {
    // TODO 通过命令行调用java程序还是报找不到main方法错误。暂时todo
    public static void main(String[] args){
        System.out.println(Arrays.toString(args));
    }
}
