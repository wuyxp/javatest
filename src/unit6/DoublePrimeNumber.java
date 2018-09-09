/*
双素数
    比如 （3，5）（5，7）（11，13）
找出10000以内的双素数
 */
package unit6;

public class DoublePrimeNumber {
    public static void main(String[] args){
        final int MAX = 10000;
        String result = "";
        for(int i=3;i<MAX;i++){
            if(checkPrimeNumber(i) && checkPrimeNumber(i+2)){
                result += "("+i+","+(i+2)+")\n ";
            }
        }
        System.out.printf("%d以内的双素数有%s",MAX,result);
    }
    private static boolean checkPrimeNumber(int number){
        for(int i=2;i<number-1;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
