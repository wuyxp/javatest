package unit9;

/*
有一个新的圆类
半径为自己的私有属性
并且有单独的访问器和设置器
 */
public class CircleWithPrivateDataFields {
    private double radius = 1;
    private static int numberOfObjects = 0;

    CircleWithPrivateDataFields(){
        CircleWithPrivateDataFields.numberOfObjects++;
    }
    CircleWithPrivateDataFields(double r){
        radius = r;
        CircleWithPrivateDataFields.numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
