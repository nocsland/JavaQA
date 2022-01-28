package HW3.Phone;

public class Application {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone(400,"Model 4", 4.0);
        Phone phone5 = new Phone(500,"Model 5");


        phone1.setNumber(100);
        phone1.setModel("Model 1");
        phone1.setWeight(1.0);

        phone2.setNumber(200);
        phone2.setModel("Model 2");
        phone2.setWeight(2.0);

        phone3.setNumber(300);
        phone3.setModel("Model 3");
        phone3.setWeight(3.0);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());

        phone1.receiveCall("Иван");
        phone2.receiveCall("Денис");
        phone3.receiveCall("Андрей");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("Иван",501);
        phone2.receiveCall("Денис", 502);
        phone3.receiveCall("Андрей",503);

        phone1.sendMessage(new int[]{15, 16, 17, 18});
        phone2.sendMessage(new int[]{25, 26, 27, 28});
        phone3.sendMessage(new int[]{35, 36, 37, 38});
    }
}
