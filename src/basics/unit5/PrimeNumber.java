/*
输出前100个素数列表，并且展示素数的个数
 */
package basics.unit5;

public class PrimeNumber {
    public static void main(String[] agrs){
        final int MAX = 100;
        String result = "";
        for(int i=3;i<MAX;i++){
            boolean flag = true;
            for(int j=2 ; j< i/2;j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                // TODO 这是在循环中使用字符串链接好像有性能问题。
                result = result + "   "+i;
            }
        }
        result = "2"+result;
        System.out.printf("%d以内的素数有\n%s",MAX,result);
    }
}
