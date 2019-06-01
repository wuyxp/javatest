/*
随机生成指定范围内的一个字符
 */
package basics.unit6;

public class RandomCharacter {
    public static char getRandomCharacter(char c1, char c2) {
        return (char) (c1 + Math.random() * (c2 - c1 + 1));
    }
    public static char getRandomChar(String s) {
        char r = ' ';
        switch (s) {
            case "LowerCase":
                r = getRandomCharacter('a', 'z');
                break;
            case "UpperCase":
                r = getRandomCharacter('A', 'Z');
                break;
            case "Digit":
                r = getRandomCharacter('0', '9');
                break;
            default:
                r = getRandomCharacter('\u0000', '\uFFFF');
        }
        return r;
    }
}
