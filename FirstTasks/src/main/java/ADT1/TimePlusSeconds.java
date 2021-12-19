package ADT1;

public class TimePlusSeconds {
    public static void main(String[] args) {
        timePlusInterval(0, 0, 0, 120);
        timePlusInterval(0, 59, 0, 121);
        timePlusInterval(22, 0, 0, 3600);
        timePlusInterval(22, 0, 0, 7200);
        timePlusInterval(22, 0, 0, 7201);
        timePlusInterval(0, 0, 0, 3600);
        timePlusInterval(0, 0, 0, 3601);
        timePlusInterval(23, 59, 59, 59);


    }

    public static void timePlusInterval(int h, int m, int s, int interval) {
        int sumSeconds = h * 3600 + m * 60 + s + interval;
        int second = (sumSeconds) % 60;
        int minutes = (sumSeconds / 60) % 60;
        int hours = (sumSeconds / 3600) % 24;
        System.out.format("%s: %s: %s \n", hours, minutes, second);


    }
}
