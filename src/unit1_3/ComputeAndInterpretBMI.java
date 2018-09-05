package unit1_3;

import java.util.Scanner;

/*
身体质量指数（BMI）是关于体重指标的健康测量。
可以通过以千克为单位的体重除以以米为单位的身高的平方，等到BMI的值

    BMI = weight / Math.pow( height, 2 );

下面是针对于20岁左右的年轻人的对比
BMI < 18.5  偏瘦
18.5 <= BMI < 25.0 正常
25.0 <= BMI < 30.0 超重
30.0 <= BMI 过胖
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] arge){
        System.out.println("请输入体重（kg）");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();

        System.out.println("请输入身高（m）");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        String log;
        if(bmi < 18.5){
            log = "偏瘦";
        }else if(bmi >= 18.5 && bmi < 25.0){
            log = "正常";
        }else if(bmi >= 25.0 && bmi < 30.0){
            log = "超重";
        }else{
            log = "肥胖";
        }
        System.out.println("计算出你的体质BMI是"+bmi+",你属于"+log+"范围");
    }
}
