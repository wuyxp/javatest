package basics.unit1_3;

public class ShowCurrentTime {
    public static void main(String[] arge){
        System.out.println("获取当前的事件");
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours+8) % 24;

        String massage = "当前时间时"+currentHours+":"+currentMinutes+ ":"+currentSeconds;
        System.out.println(massage);
    }
}
