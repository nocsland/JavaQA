package CW3;

public class ReferenceAndPrimitiveData {
    public static void main(String[] args) {
        // При работе с примитивными типами данных типа int в функцию вызывается копия данных, сами данные не
        // изменияются, а при вызове в метод ссылочных данных например типа Car передается ссылка на объект и изменяются
        // свойства объекта, а не его копии.


        int a = 5;
        int b = 2;
        sum(a, b);
        System.out.println("main a = " + a);
        System.out.println("main b = " + b);
        Car vehicle = new Car();
        initializeCar(vehicle);
        System.out.println("Цвет машины: " + vehicle.color);

    }

    static void sum(int a, int b) {
        a = a + b;
        System.out.println("function a = " + a);
        System.out.println("function b = " + b);
    }

    static void initializeCar(Car car) {
        car.color = "Коричневый";
        car.setDriveType("front");

    }
}
