package HW2;

import java.util.HashMap;
import java.util.Map;

public class OutputMaxAverageScore {
    public static void main(String[] args) {
        //Заполнение карты
        Map<String, Double> studentsAverageScore = new HashMap<>();
        studentsAverageScore.put("Иванов", 4.0);
        studentsAverageScore.put("Анисимов", 4.5);
        studentsAverageScore.put("Тестов", 4.5);
        studentsAverageScore.put("Балобанов", 4.5);
        studentsAverageScore.put("Петров", 4.2);
        studentsAverageScore.put("Сидоров", 4.5);

        //Вызов метода
        getMaxAverageScore(studentsAverageScore);

    }

    //Метод "Поиск и вывод данных студента с наивысшим средним баллом"
    public static void getMaxAverageScore(Map<String, Double> mapAverageScore) {
        var keys = mapAverageScore.keySet();
        Double maxAverageScore = 0.0;
        String surname = null;
        for (var key : keys) {
            if (mapAverageScore.get(key) > maxAverageScore) {
                maxAverageScore = mapAverageScore.get(key);
                surname = key;
            }
        }
        System.out.println(surname + " " + maxAverageScore);
    }
}