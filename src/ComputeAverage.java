import java.util.*;

/*
计算平均数
* */
public class ComputeAverage {
    public static void main(String[] agre){
        System.out.println("请输入三个数值：");
        double num1 = new Scanner(System.in).nextDouble();
        double num2 = new Scanner(System.in).nextDouble();
        double num3 = new Scanner(System.in).nextDouble();
        System.out.println("他们的平均数是："+ ((num1+ num2+ num3) / 3 ));

    }
}
