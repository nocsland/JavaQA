package HW3.Matrix;

public class Matrix {
    private final double[][] matrix;
    private final int m;
    private final int n;

    public Matrix(int m, int n) {
        this.matrix = new double[m][n];
        this.m = m;
        this.n = n;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }


    public void fillArray() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 10;
            }
        }
    }



    public void outputMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void multiPlyMatrixByNumber(int number) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] *= number;

            }
        }
        System.out.println("Результат умножения матрицы на " + number);
    }

    public void sumOfMatrices(double[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.matrix[i][j] = this.matrix[i][j] + matrix[i][j];

            }

        }
        System.out.println("Результат сложения матриц");
    }
}

