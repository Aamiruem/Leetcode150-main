package L4Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        //case for empty matrix
        if (row == 0 || col == 0) {
            return list;
        }

        //set boundary for the limits of movement
        int left = 0, right = col - 1, top = 0, bottom = row - 1;

        //now this we will set at actual condition
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++; //to make another row as top

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; //we are narrowing our adding-element space 

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {

        SpiralMatrix54 obj = new SpiralMatrix54();

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(obj.spiralOrder(matrix));
        int[][] matrix2 = { {}, {}, {} };

        System.out.println(obj.spiralOrder(matrix2));
        int[][] matrix3 = { { 1 } };

        System.out.println(obj.spiralOrder(matrix3));
        int[][] matrix4 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

        System.out.println(obj.spiralOrder(matrix4));
        int[][] matrix5 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(obj.spiralOrder(matrix5));
    }
}
