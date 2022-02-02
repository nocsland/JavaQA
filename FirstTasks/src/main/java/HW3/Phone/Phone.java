package HW3.Phone;

public class Phone {
    private int number;
    private String model;
    private Double weight;

    //Геттеры и сеттеры
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    // Выводит имя звонящего
    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    // Выводит имя звонящего и номер
    public void receiveCall(String name,int incomingNumber) {
        System.out.printf("Звонит %s %d\n",name, incomingNumber);
    }

    //Выводит список номеров на которые отправлено сообщение
    public void sendMessage(int[] numbers){
        for (int i:numbers){
            System.out.print(i + " ");
        }
        System.out.println("На эти номера отправлено сообщение");
    }

    //Конструктор с номером, моделью и весом
    Phone(int number, String model, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //Конструктор с номером и моделью
    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //Конструктор по умолчанию
    Phone() {
    }

}




