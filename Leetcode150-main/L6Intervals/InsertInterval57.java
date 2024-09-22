package L6Intervals;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;
import static java.util.Comparator.comparingInt;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public class InsertInterval57 {

    private static final int[] DUMMY_INTERVAL = {MIN_VALUE, MIN_VALUE};

    private final Deque<int[]> q;

    public InsertInterval57() { // Fixed constructor definition
        this.q = new LinkedList<>();
        this.q.add(DUMMY_INTERVAL);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        var itr = concatenate(intervals, newInterval).sorted(comparingInt(a -> a[0])).iterator();

        while (itr.hasNext()) {
            int[] ivt = itr.next(); // Initialize `ivt` properly here
            if (overlaps(ivt)) {
                updateLastInterval(ivt);
            } else {
                append(ivt);
            }
        }

        return createOutput();
    }

    private boolean overlaps(int[] ivt) {
        return q.getLast()[1] >= ivt[0]; // Checks if the last interval in `q` overlaps with `ivt`
    }

    private int[][] createOutput() {
        return q.stream()
                .skip(1) // skipping the added DUMMY_INTERVAL
                .toArray(int[][]::new);
    }

    private void updateLastInterval(int[] ivt) {
        var prev = q.getLast();
        prev[1] = max(prev[1], ivt[1]); // Merge the current interval with the last interval
    }

    private void append(int[] ivt) {
        q.add(ivt); // Append non-overlapping intervals
    }

    private static Stream<int[]> concatenate(int[][] intervals, int[] newInterval) {
        return Stream.concat(Stream.of(newInterval), Stream.of(intervals)); // Concatenate intervals
    }
}
