package unit9;

import java.util.Random;

/*
随机数类

 */
public class TestRandom {
    public static void main(String[] args){
        Random r1 = new Random(123);
        Random r2 = new Random(123);
        Random r3 = new Random();
        System.out.println(r1.nextInt(10));
        System.out.println(r2.nextInt(10));
        System.out.println(r3.nextInt(10));
        System.out.println(r1 == r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
}
