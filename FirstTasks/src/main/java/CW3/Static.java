package CW3;


// Cтатический метод
public class Static {
    private String color;
    private String driveType;
    private Double engineVolume;
    static private int count = 0;



    public Static() {
        this.color = "Коричневый";
        count++;

    }


    public static void setCount(int count) {
        Static.count = count;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public static int getCount() {
        return count;
    }

    public String getColor() {
        return color;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getDriveType() {
        return driveType;
    }

}
