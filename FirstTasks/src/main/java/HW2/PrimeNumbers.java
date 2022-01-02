package HW2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предел поиска простых чисел ");
        int numberIn = in.nextInt();
        outPutPrimeNumbers(numberIn);
        in.close();
    }

    public static void outPutPrimeNumbers(int numberIn) {
        for (int i = 2; i < numberIn; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

