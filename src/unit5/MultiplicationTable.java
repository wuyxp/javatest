/*
打印99乘法表
 */
package unit5;

public class MultiplicationTable {
    public static void main(String[] agrs){
        final int MAX = 9;
        for(int i=0;i<=MAX;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("%d * %d = %2d   ",i,j,i*j);
            }
            System.out.println(" ");
        }
    }
}
