package CW3;

public class SetConstructor {
    private String color;
    Integer seatsCount;
    private String driveType;
    private Double engineVolume;

    public SetConstructor() {
        this.driveType = "Переднеприводный";
        this.color = "Коричневый";
        this.seatsCount = 5;
        this.engineVolume = 2.0;
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


    public String getColor() {
        return color;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    String getDriveType() {
        return driveType;
    }

}
