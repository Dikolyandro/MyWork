public class Matrix {

    private int cols;
    private int rows;

    private int[][] data;

    private int[][] data2;

    // constructor
    public Matrix(int[][] data, int[][] data2, int rows,int cols) {
        this.data = data;
        this.rows = rows;
        this.cols = cols;
        this.data2 = data2;
    }

    // method to print
    public static void print(int[][] data, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method for matrix addition
    public void add(int rows, int cols, int[][] data, int[][] data2) {
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = data[i][j] + data2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method for multiple by number of 2 matrices
    public void scalar(int rows, int cols, int[][] data, int[][] data2) {
        System.out.println("Matrix 1 multiple by 2");
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = data[i][j] * 2;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2 multiple by 2");
        int[][] res2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res2[i][j] = data2[i][j] * 2;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res2[i][j] + " ");
            }
            System.out.println();
        }
    }
    // matrix multiplication
    public void multy(int[][] data, int[][] data2, int rows1, int cols1, int rows2, int cols2) {

        int[][] res = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    res[i][j] += data[i][k] * data2[k][j];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    // main
    public static void main(String[] args) {
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        Matrix mx = new Matrix(data1,data2,2,2);

        System.out.println("Matrix 1:");
        print(data1,2,2);

        System.out.println("Matrix 2:");
        print(data2,2,2);

        System.out.println("Addition of Matrices:");
        mx.add(mx.rows, mx.cols, mx.data,mx.data2);

        System.out.println("Scalar:");
        mx.scalar(mx.rows, mx.cols, mx.data, mx.data2);

        System.out.println("Matrix multiplication:");
        mx.multy(mx.data, mx.data2, 2, 2, 2, 2);

    }


}
