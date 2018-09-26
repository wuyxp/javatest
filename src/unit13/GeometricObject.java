package unit13;

import java.util.Date;

/*
抽象类
实现几何图形的方法
关于抽象类要注意的几个问题：
1.抽象类和常规类很像，但是不能使用new操作符创建它的实例。
2.抽象方法只有定义，没有实现。它的实现必须由子类提供。
3.一个包含抽象方法的类必须声明为抽象类
4.抽象类的构造方法定义为protected，因为它只被子类使用。
5.创建一个具体子类的实例时，它的父类构造方法被调用以初始化父类中的定义的数据域。

 */
public abstract class GeometricObject {


    private String color = "white";
    private boolean filled = false;
    private Date dataCreated;

    protected GeometricObject() {
        this.dataCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dataCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    /**/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "created on " + dataCreated + "\ncolor：" + color + "and filled：" + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
