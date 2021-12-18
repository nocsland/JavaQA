package HW1;

public class GreetingTime {
    public static void main(String[] args) {
        greetingTime(5, 0, 1, "Антон");
        greetingTime(11, 59, 0, "Антон");
        greetingTime(12, 0, 0, "Антон");
        greetingTime(15, 59, 0, "Антон");
        greetingTime(16, 0, 0, "Антон");
        greetingTime(22, 59, 0, "Антон");
        greetingTime(23, 0, 0, "Антон");
        greetingTime(4, 59, 0, "Антон");


    }

    public static void greetingTime(int h, int m, int s, String name) {
        if (h >= 5 && h < 12) {
            System.out.println("Доброе утро, " + name);
        } else if (h >= 12 && h < 16) {
            System.out.println("Доброе день, " + name);
        } else if (h >= 16 && h < 23) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }

    }
}
