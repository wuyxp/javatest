package basics.unit1_3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] arge){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        System.out.println("请计算"+number1+"+"+number2+"等于几啊？");
        int result = new Scanner(System.in).nextInt();
        String log;
        if(result == (number1 + number2) ){
            log = "诶要！回答正确哦";
        }else{
            log = "回答错误啊渣比。正确答案是"+ (number1+number2);
        }
        System.out.println(log);

    }
}
