package unit12;

/*
自定义异常类，用于捕获设置半径为负数的圆
 */
public class InvalidRadiusException extends Exception{
    private double radius;
    public InvalidRadiusException(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public String toString(){
        return "半径"+this.radius+"不能是负数";
    }
}
