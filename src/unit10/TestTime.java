package unit10;

import java.math.BigInteger;

/*
用来测试Time类
new Time()
new Time(5555500000)
 */
public class TestTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Time t1 = new Time();
        Time t2 = new Time(new BigInteger("153681037616600000000"));
        t1.printTime();
        t2.printTime();
        t2.setTime(new BigInteger("20000000"));
        t2.printTime();
    }
}
