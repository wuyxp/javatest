package basics.unit12;

import basics.unit9.BaseCircle;

public class CircleWithException extends BaseCircle {
    public CircleWithException() {
        super();
    }

    public CircleWithException(double r) throws InvalidRadiusException {
        super(r);
        if(r < 0){
            throw new InvalidRadiusException(r);
        }
    }

    public void setRadius(double r) throws InvalidRadiusException {
        if(r< 0){
            throw new InvalidRadiusException(r);
        }else{
            try{
                super.setRadius(r);
            }catch (Exception ex){

            }
        }
    }
}
