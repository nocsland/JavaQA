package HW3.Phone;

public class Phone {
    private int number;
    private String model;
    private Double weight;

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


    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name,int incomingNumber) {
        System.out.printf("Звонит %s %d\n",name, incomingNumber);
    }

    public void sendMessage(int[] numbers){
        for (int i:numbers){
            System.out.print(i + " ");
        }
        System.out.println("На эти номера отправлено сообщение");
    }

    Phone(int number, String model, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

}




