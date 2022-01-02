package HW2;

import java.util.Random;
import java.util.Scanner;

public class CompareSumAndNumber {
    public static void main(String[] args) {
        //Запрашиваем у пользователя длину массива и заполняем его случайными числами от 0 до 100
        System.out.print("Введите длину массива ");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] arrayDigits = new int[arraySize];
        Random rnd = new Random();
        for (int i = 0; i < arraySize; i++) {
            arrayDigits[i] = rnd.nextInt(100);
            System.out.print(arrayDigits[i] + " ");
        }
        //Запрашиваем у пользователя число с каким будем сравнивать сумму 2-х элементов массива
        System.out.print("\nВведите число для сравнения ");
        int number = in.nextInt();

        //Вызов метода для сравнения
        compareSumAndNumber(arrayDigits, number);

    }

    // Метод сравнения суммы 2-х элементов массива и введенного номера
    public static boolean compareSumAndNumber(int[] array, int number) {
        int sum = 0;
        int len = array.length;
        for (int e1 : array) {
            for (int e2 : array) {
                if (e1 + e2 == number && e1 * 2 != number) {
                    return true;
                }
            }
        }
        return false;
    }
}
