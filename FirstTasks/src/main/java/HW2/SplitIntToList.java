package HW2;

import java.util.ArrayList;
import java.util.List;

public class SplitIntToList {
    public static void main(String[] args) {
        splitIntToList(455212871);

    }

    public static List<Integer> splitIntToList(int number) {
        List<Integer> digitsFromNumber = new ArrayList<>();

        while (number != 0) {
            int result = number % 10;
            number /= 10;
            digitsFromNumber.add(0,result);
            System.out.println(digitsFromNumber);

        }
        return digitsFromNumber;
    }
}
