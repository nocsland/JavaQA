package HW3.Matrix;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.print("Введите количество строк матрицы ");
        Scanner in = new Scanner(System.in);
        int rowsMatrix = in.nextInt();
        System.out.print("Введите количество столбцов матрицы ");
        int columnsMatrix = in.nextInt();
        //Создать матрицу
        Matrix matrix = new Matrix(rowsMatrix, columnsMatrix);
        Matrix matrix2 = new Matrix(rowsMatrix, columnsMatrix);

        // Заполнить матрицы
        matrix.fillArray();
        matrix2.fillArray();

        // Вывести матрицы в консоль
        matrix.outputMatrix();
        matrix2.outputMatrix();

        //Сложить матрицы
        matrix.sumOfMatrices(matrix2.getMatrix());
        matrix.outputMatrix();

        //Умножить матрицу на число
        matrix.multiPlyMatrixByNumber(5);
        matrix.outputMatrix();




    }


}

