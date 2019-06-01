package basics.unit1_3;

import java.util.Scanner;

/*
让用户输入年利率、贷款额度、支付的年数
计算和显示出支付额度，总支付额度
月支付额度公式

    月支付额度 = (贷款额度 * 月利率) / ( 1 - ( 1 / Math.pow((1 + 月利率), (年数 * 12)) ) )

总支付额度公式

    总支付额度 = 月支付额度 * 年数 * 12
 */
public class ComputeLoan {
    public static void logString(String arge){
        System.out.println(arge);
    }

    public static double systemIn(String arge){
        logString(arge);
        double i = new Scanner(System.in).nextDouble();
        return i;
    }
    public static double getMonthlyPayment(double loanAmout, double monthlyInterestRate, double numberOfYears){
        return (loanAmout * monthlyInterestRate) / ( 1 - ( 1 / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)) ) );
    }

    public static void main(String[] arge){
        double loanAmout = systemIn("请输入贷款额度");
        double annualInterestRate = systemIn("请输入年利率");
        double numberOfYears = systemIn("请输入需要支付的年数");

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = getMonthlyPayment(loanAmout, monthlyInterestRate, numberOfYears);
        logString("计算出的月支付额度是："+ monthlyPayment);
        logString("计算出的年支付额度是："+ monthlyPayment * numberOfYears * 12);
    }
}
