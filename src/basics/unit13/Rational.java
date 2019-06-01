package basics.unit13;

public class Rational extends Number implements Comparable<Rational> {


    private long numerator = 0;
    private long denominator = 1;

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public Rational() {
        this(0, 1);
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational rational) {
        long n = numerator * rational.getDenominator() + denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational rational) {
        long n = numerator * rational.getDenominator() - denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational rational) {
        long n = numerator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational rational) {
        return this.multiply(this.reciprocal(rational));
    }

    public Rational reciprocal(Rational rational) {
        if (rational.getNumerator() == 0) {
            return null;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public int compareTo(Rational rational) {
        long sub = this.subtract(rational).getNumerator();
        if (sub > 0) {
            return 1;
        } else if (sub < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
