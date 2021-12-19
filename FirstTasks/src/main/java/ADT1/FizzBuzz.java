package ADT1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Введите целое число ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fizzBuzz(number);

    }
    public static void fizzBuzz(int number){
        if (number % 3 == 0){
            System.out.print("Fizz");
        } if (number % 5 == 0){
            System.out.print("Buzz");
        }
        System.out.println();
    }


}
