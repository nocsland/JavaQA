package HW2;

import java.util.ArrayList;
import java.util.List;

public class ComparisonNumberAndLists {
    public static void main(String[] args) {

        //Заполняем листы данными
        List<List<Integer>> userListsZero = new ArrayList<>();
        userListsZero.add(List.of(58, 43, 35, 4));
        userListsZero.add(List.of(65, 32));
        userListsZero.add(List.of(48, 65, 32, 5));

        List<List<Integer>> userListsFirst = new ArrayList<>();
        userListsFirst.add(List.of(22));
        userListsFirst.add(List.of(48, 58));

        List<List<Integer>> userListsSecond = new ArrayList<>();
        userListsSecond.add(List.of(12, 43, 35, 4));

        //Вызываем метод сравнения числа и листов
        areIdentical(424, userListsZero);
        areIdentical(12, userListsFirst);
        areIdentical(4, userListsSecond);
    }

    // Сравниваем введенное число с элементами List<List<Integer>> в случае успеха возвращаем true
    public static boolean areIdentical(int userNumber, List<List<Integer>> lists) {
        List<Integer> digitsList = splitIntToList(userNumber);
        int count = 0;
        int lenDigitsList = digitsList.size();
        for (int i = 0; i < lenDigitsList; i++) {
            if (digitsList.size() == lists.size() && (digitsList.get(i) == (lists.get(i)).size())) {
                count++;
                if (count == lenDigitsList) {
                    return true;
                }
            }
        }
        return false;
    }

    //Приводим переданное в методе число к List<integer>
    public static List<Integer> splitIntToList(int number) {
        List<Integer> getDigitsFromNumber = new ArrayList<>();

        while (number != 0) {
            int result = number % 10;
            number /= 10;
            getDigitsFromNumber.add(0, result);
        }
        return getDigitsFromNumber;
    }
}
