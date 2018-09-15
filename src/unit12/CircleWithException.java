package unit12;

import unit9.BaseCircle;

public class CircleWithException extends BaseCircle {
    public CircleWithException() {
        super();
    }

    public CircleWithException(double r) throws IllegalAccessException {
        super(r);
        if(r < 0){
            throw new IllegalAccessException("设置的半径不能是负数");
        }
    }

    public void setRadius(double r) throws IllegalAccessException {
        if(r< 0){
            throw new IllegalAccessException("设置的半径不能为负数");
        }else{
            try{
                super.setRadius(r);
            }catch (Exception ex){

            }
        }
    }
}
