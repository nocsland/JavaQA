package HW1;

import java.util.Scanner;

public class DivisionResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a ");
        double a = in.nextDouble();
        System.out.print("Введите число b ");
        double b = in.nextDouble();
        double division = a / b;
        String result = String.format("Результат %s / %s = %s", a, b, division);
        System.out.println(result);


    }
}
