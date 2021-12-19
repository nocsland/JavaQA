package ADT1;

public class TimePlusSeconds {
    public static void main(String[] args) {
        timePlusSeconds(0, 0, 0, 120);
        timePlusSeconds(0, 59, 0, 121);
        timePlusSeconds(22, 0, 0, 3600);
        timePlusSeconds(22, 0, 0, 7200);
        timePlusSeconds(22, 0, 0, 7201);
        timePlusSeconds(0, 0, 0, 3600);
        timePlusSeconds(0, 0, 0, 3601);

    }

    public static void timePlusSeconds(int h, int m, int s, int interval) {
        int second = interval % 60;
        int minutes = (m + interval / 60) % 60;
        int hours = (h + interval / 3600) % 24;
        System.out.format("%s: %s: %s \n", hours, minutes, second);


    }
}
