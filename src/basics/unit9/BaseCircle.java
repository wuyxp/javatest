package basics.unit9;

public class BaseCircle {
    protected double radius;

    public BaseCircle() {
        radius = 1.0;
    }

    public BaseCircle(double r) {
        radius = r;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimete() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double r) throws Exception {
        radius = r;
    }
}
