package CW3;

public class Car {
    String color;
    String brand;
    Integer seatsCount;
    private String driveType;
    Double engineVolume;
    Integer wheelsCount;
    Wheel[] wheels = new Wheel[4];
    int position = 0;

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
        if (radius <= 0){
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
