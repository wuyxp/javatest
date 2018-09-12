package unit9;

/*
线性方程求交点坐标

    ax+by = e
    cx+dy = f

    x = (ed-bf)/(ad-bc)
    y = (af-ec)/(ad-bc)

这个类包括
私有数据a,b,c,d,e,f
一个参数a,b,c,d,e,f的构造方法
a,b,c,d,e,f的六个get方法
一个名为isSolvable()的方法，如果ad-bc不为0则返回true
方法getX()和getY()返回这个方程的解

编写一个测试程序，提示用户输入a，b，c的值，然后显示判别式的结果，
如果判别式为正数，显示两个根
如果判别式为0，显示一个跟
如果判别式为负数，显示无根
 */
public class SimpleLinearEquation {
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation(4,5,3,2,5,6);
        if(le.isSolvable()){
            System.out.println("此方程可接");
            System.out.println("x="+le.getX());
            System.out.println("y="+le.getY());
        }else{
            System.out.println("此方程无法可解");
        }
    }
}

class LinearEquation {

    double a, b, c, d, e, f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    boolean isSolvable() {
        return this.a * this.d != this.b * this.c;
    }

    double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}

