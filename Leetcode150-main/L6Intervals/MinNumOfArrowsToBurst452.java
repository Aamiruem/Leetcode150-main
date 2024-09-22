// Greedy Algo
// TC: O 1 , SC: O 1
package L6Intervals;

import java.util.Arrays;

public class MinNumOfArrowsToBurst452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {

        int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        MinNumOfArrowsToBurst452 obj = new MinNumOfArrowsToBurst452();
        System.out.println(obj.findMinArrowShots(points));
        
    }
}

// 1,6  2,8  7,12  10,16
