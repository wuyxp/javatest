/*
猜字游戏
    随机产生一个单词，提示用户一次猜测一个字母
    单词中每个字母显示一个星号
    当用户猜测正确后，正确的字母显示出来，
    当用户猜出一个单词，显示猜错的次数，并且询问用户是否继续对另外一个单词进行游戏，
    声明一个数组来存储单词
    String[] words = {"write", "that", ...};
 */
package unit7;

import java.util.Arrays;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = generatorWord();
        System.out.println(s);
        char[] pc = genratorInitPassword(s);

        int count = 0;
        boolean isDone = false;
        System.out.println("请输入要猜单词的字符：");
        char c = scanner.next().charAt(0);
        while (!isDone) {
            int pcIndex = diffArrays(s, pc, c);
            if (pcIndex != -1) {
                generatorPassword(pc, pcIndex, c);
                System.out.println("猜对了一个，请继续："+Arrays.toString(pc));
                if (Arrays.equals(pc, s)) {
                    System.out.println("输入完全正确，输错的次数是：" + count);
                    isDone = true;
                }
                c = scanner.next().charAt(0);
            } else {
                System.out.println("密码字符输入不对，请重新输入：");
                count++;
                c = scanner.next().charAt(0);
            }
        }
    }


    private static int diffArrays(char[] c1, char[] c2, char c) {
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c && c2[i] != c) {
                return i;
            }
        }
        return -1;
    }

    private static void generatorPassword(char[] c1, int index, char value) {
        c1[index] = value;
    }

    private static int indexOf(char[] c, char value, int index) {
        for (int i = index; i < c.length; i++) {
            if (c[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static char[] generatorWord() {
        int minLength = 4;
        int maxLength = 6;
        int length = (int) (minLength + (Math.random() * (maxLength - minLength)));
        char[] s = new char[length];
        for (int i = 0; i < length; i++) {
            char c = (char) ('a' + (Math.random() * 26));
            s[i] = c;
        }
        return s;
    }

    private static char[] genratorInitPassword(char[] c) {
        char[] pc = new char[c.length];
        Arrays.fill(pc, '*');
        return pc;
    }
}
