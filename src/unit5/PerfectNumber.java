/*
如果一个正整数等于除了等于他本身之外的所有除数的和，就称为完全数。
比如
    6 = 3 + 2 + 1
    28 = 14 + 7+ 4+2+1

找出10 000以内的4个完全数
 */
package unit5;

public class PerfectNumber {
    private static boolean isPerfect(int number){
        int half = number / 2;
        int count = 0;
        for(int i = 1;i <= half;i++){
            if(number % i == 0){
                count += i;
            }
        }
        return count == number;
    }
    public static void main(String[] agrs){
        String result = "";
        int count = 0;
        final int MAX = 10000;
        for(int i=2;i<MAX;i++){
            if(isPerfect(i)){
                count++;
                result = result + "     " + i;
            }
        }
        System.out.printf("%d以内的完全数有%d个，分别是%s",MAX, count, result);
    }
}
