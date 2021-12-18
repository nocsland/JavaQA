package HW1;

public class IsNumberEven {
    public static void main(String[] args) {
        isEven(5);
        isEven(4);
        isEven(0);
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " это четное число");
        } else System.out.println(number + " это нечетное число");
    }

}
