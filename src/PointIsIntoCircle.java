import java.util.Scanner;

/*
提示用户输入一个点（x, y）然后检查这个点是否在原点（0 0）为圆心，半径为10的圆内。
例如：
    （4, 5）是圆内的一点，（9，9）是圆外的一点
 */
public class PointIsIntoCircle {
    public static void main(String[] arge){
        final double L = 10.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的x坐标：");
        double x = scanner.nextDouble();
        System.out.println("请输入你的y坐标：");
        double y = scanner.nextDouble();

        double distance = Math.pow((x*x + y*y), .5);
        if(L<distance){
            System.out.println("您输入的坐标("+x+","+y+")"+"没有在圈内");
        }else{
            System.out.println("您输入的坐标("+x+","+y+")"+"在内部");
        }
    }
}
