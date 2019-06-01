package basics.unit10;

import java.math.BigInteger;

/*
Time类
1.表示时间的数据域hour，minute和second
2.一个以当前时间创建的Time对象的无参数构造方法（数据域的值表示当前时间）
3.一个构造Time对象的构造方法，这个方法有一个特定的时间值，这个值是以毫秒表示的，从1970年1月1日午夜开始到现在流失的时间段（数据域的值表示这个时间）
4.一个构造带特定的小时，分钟，和秒的Time对象的构造方法
5.三个数据域的hour，minute和second各自的get方法
6.一个名为setTime（long elapseTime）的方法使用流逝的时间给对象设置一个新时间。例如如果流逝的时间为555550000，则转换为10小时，10分钟，10秒
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    private int ms;
    private BigInteger bigMs;

    private static final BigInteger T = new BigInteger("1000");
    private static final BigInteger S = new BigInteger("60");

    Time(BigInteger bigMs) {
        this.bigMs = bigMs;
        this.initTime(this.bigMs);
    }

    Time() {
        this(new BigInteger(""+System.currentTimeMillis()));
    }

    Time(Time t) {
        this(t.bigMs);
    }

    void initTime(BigInteger bigMs) {
        this.ms = bigMs.remainder(T).intValue();
        this.second = bigMs.divide(T).remainder(S).intValue();
        this.minute = bigMs.divide(T).divide(S).remainder(S).intValue();
        this.hour = bigMs.divide(T).divide(S).divide(S).intValue();
    }

    void printTime() {
        System.out.printf("当前时间是：(%d:%d:%d  %d)", this.hour, this.minute, this.second, this.ms);
    }

    void setTime(BigInteger bigMs) {
        this.initTime(bigMs);
        System.out.printf("设置后的时间时：%d小时，%d分钟，%d秒，%d毫秒", this.getHour(), this.getMinute(), this.getSecond(), this.getMs());
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMs() {
        return ms;
    }

}
