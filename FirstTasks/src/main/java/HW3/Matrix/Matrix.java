package HW3.Matrix;

public class Matrix {
    private Double numbers[][];
    private int m;
    private int n;

    public Matrix(Double[][] numbers, int m, int n) {
        this.numbers = numbers;
        this.m = m;
        this.n = n;
    }

    public Double[][] getNumbers() {
        return numbers;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }


    static Double[][] fillArray(Double array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Double) Math.random() * 100;
            }
        }
        return array;


    }

    public void matrixOutput(Matrix matrix) {
        for (int i = 0; i < matrix.getM(); i++) {
            for (int j = 0; j < matrix.getN(); j++) {
                System.out.println(matrix.getNumbers()[i][j]);
            }

        }
        System.out.println();
    }
}
