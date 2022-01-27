package CW3;

public class Application {
    public static void main(String[] args) throws Exception {
        Car vehicle = new Car();
        vehicle.color = "red";
        vehicle.setDriveType("front");
        vehicle.engineVolume = 1.6;
        vehicle.setWheelRadius(15);
        vehicle.printRadiuses();
        System.out.println(vehicle.getCurrentPosition());
        vehicle.startEngine();
        vehicle.drive(40);
        System.out.println(vehicle.getCurrentPosition());
        vehicle.toPark("Параллельно");
        vehicle.stopEngine();
        System.out.println(vehicle.getCurrentPosition());

    }
}
