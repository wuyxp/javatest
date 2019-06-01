/*
1.随机生成100个小写字母并将其放入一个字符数组中
2.对数组中每个字母出现的次数进行计数
 */
package basics.unit7_8;

public class CountLettersInArray {
    public static void main(String[] args) {
        final int MAX = 100;
        char[] codes = new char[MAX];
        int[] count = new int[26];
        for (int i = 0; i < MAX; i++) {
            codes[i] = getRandomLowerCase();
        }
        System.out.println(codes);
        for (int i = 0; i < MAX; i++) {
            int tmp = (int) (codes[i] - 'a');
            count[tmp] += 1;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%s:%d \n", (char) (i + 'a'), count[i]);
        }

    }

    private static char getRandomLowerCase() {
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }
}
