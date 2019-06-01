package basics.unit12;

/*
测试抛异常的类
 */
public class TestCircleWithException {
    public static void main(String[] args){
        CircleWithException circleWithException = new CircleWithException();
        try{
            circleWithException.setRadius(-1);
        }catch (InvalidRadiusException lex){
            System.out.println(lex);
            lex.printStackTrace(); // 这个是异步的？
        }
        finally {
            System.out.println("这里都会执行？");
        }
    }
}
