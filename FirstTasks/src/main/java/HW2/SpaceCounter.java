package HW2;

import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args) {
        System.out.println("Введите фразу");
        Scanner in = new Scanner(System.in);
        String userData = in.nextLine();
        spacesCounter(userData);
        in.close();
    }

    public static void spacesCounter(String userData) {
        char[] charArray = userData.toCharArray();
        int i = 0;
        for (var symbol : charArray) {
            if (symbol == ' ') {
                i++;

            }
        }
        System.out.printf("Найдено %d пробелов", i);
    }
}


