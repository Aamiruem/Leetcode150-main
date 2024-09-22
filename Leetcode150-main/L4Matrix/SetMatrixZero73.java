package L4Matrix;

public class SetMatrixZero73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] forRows = new boolean[m];
        boolean[] forCols = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    forRows[i] = true;
                    forCols[j] = true;
                }
            }
        } //we marked the rows and cols with true

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (forRows[i] || forCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {

        SetMatrixZero73 obj = new SetMatrixZero73();

        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        obj.setZeroes(matrix);

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
