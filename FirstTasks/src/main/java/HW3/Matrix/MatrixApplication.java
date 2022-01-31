package HW3.Matrix;


import java.util.Scanner;

public class MatrixApplication {
    public static void main(String[] args) {
        System.out.print("Введите размер матрицы m ");
        Scanner in = new Scanner(System.in);
        int rowsArray = in.nextInt();
        System.out.print("Введите размер матрицы n ");
        int columnsArray = in.nextInt();
        Double[][] arrayNumbers = new Double[rowsArray][columnsArray];
        Matrix.fillArray(arrayNumbers);
        Matrix matrix = new Matrix(arrayNumbers, rowsArray, columnsArray);
        Matrix matrix2 = new Matrix(arrayNumbers, rowsArray, columnsArray);
        matrix.matrixOutput(matrix);
        matrix2.matrixOutput(matrix2);


    }


}

