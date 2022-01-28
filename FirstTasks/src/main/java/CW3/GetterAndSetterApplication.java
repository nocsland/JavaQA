package CW3;

public class GetterAndSetterApplication {
    public static void main(String[] args) throws Exception {
        GetterAndSetter car = new GetterAndSetter();
        car.setColor("Зеленый");
        car.setDriveType("Переднеприводный");

        System.out.println(car.getColor());
        System.out.println(car.getDriveType());

    }

}
