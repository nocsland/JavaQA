package CW3;

public class YetAnotherCar {
    // геттеры и сеттеры
    private String color;
    private String brand;
    private Integer seatsCount;
    private String driveType;
    private Double engineVolume;
    private Integer wheelsCount;
    private Wheel[] wheels = new Wheel[4];
    private int position = 0;

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
    public int getSeatsCount(){
        return seatsCount;
    }

    public Double getEngineVolume(){
        return engineVolume;
    }

    public void setColor(String color){
        this.color = color;
    }

    void drive(int velocity) {
        position = position + velocity;
        System.out.println("Машина едет");
    }

    void startEngine() {
        System.out.println("Запущен двигатель");
    }

    void stopEngine() {
        System.out.println("Двигатель остановлен");
    }

    void toPark(String type) {
        position = 0;
        if (type.equals("Паралельно")) {
            System.out.println("Машина припаркована паралельно дороге");
        } else {
            System.out.println("Машина припаркована перпендикулярно");
        }

    }

    void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    int getCurrentPosition() {
        return position;
    }

    void setWheelRadius(int radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Радиус должен быть больше 0");
        }
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            wheels[i].radius = radius;

        }

    }

    void printRadiuses() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Радиус колеса №" + i + " равен " + wheels[i].getRadius());
        }
    }
}
