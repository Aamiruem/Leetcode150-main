package L4Matrix;

public class RotateImage48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] matrix1 : matrix) {
            int start = 0;
            int end = matrix.length - 1;
            while (start < end) {
                int temp = matrix1[start];
                matrix1[start] = matrix1[end];
                matrix1[end] = temp;
                end--;
                start++;
            }
        }
    }

    public static void main(String[] args) {

        RotateImage48 obj = new RotateImage48();

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        obj.rotate(matrix);

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
