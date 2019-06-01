package basics.unit13;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(4, 5);
        Rational r2 = new Rational(2, 3);
        System.out.println(r1 + "+" + r2 + "=" + r1.add(r2));
        System.out.println(r1 + "-" + r2 + "=" + r1.subtract(r2));
        System.out.println(r1 + "*" + r2 + "=" + r1.multiply(r2));
        System.out.println(r1 + "/" + r2 + "=" + r1.divide(r2));
        System.out.println(r2 + "==" + r2.doubleValue());
    }

}
