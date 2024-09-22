package L7Stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack155 {
    private List<int[]> st;

    public MinStack155() { // Constructor name should match the class name
        st = new ArrayList<>();
    }

    public void push(int val) {
        int[] top = st.isEmpty() ? new int[] { val, val } : st.get(st.size() - 1);
        int min_val = top[1];
        if (min_val > val) {
            min_val = val;
        }
        st.add(new int[] { val, min_val });
    }

    public void pop() {
        st.remove(st.size() - 1);
    }

    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
    }

    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
    }

    public static void main(String[] args) {
        MinStack155 obj = new MinStack155();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin()); // Should print -3
        obj.pop();
        System.out.println(obj.top()); // Should print 0
    }
}
