public class ComputeNum {
    public static void logString(String arge){
        System.out.println(arge);
    };
    public static void logNum(int arge){
        System.out.println(arge);
    }
    public static void logDouble(double arge){
        System.out.println(arge);
    }
    public static void main(String[] arge){
        logNum(2 * (5 / 2 + 5 / 2));
        logString("25 / 4 is" + 25 / 4);
        logDouble(Math.pow(2, 3/5));
    }
}
