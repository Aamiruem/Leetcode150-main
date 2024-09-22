package L7Stack;

import java.util.Stack;

public class validParenthesis20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(')');
            } else if (s.charAt(i) == '{') {
                st.push('}');
            } else if (s.charAt(i) == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != s.charAt(i)) {
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(new validParenthesis20().isValid(s));

        s = "()[]{}";
        System.out.println(new validParenthesis20().isValid(s));

        s = "(]";
        System.out.println(new validParenthesis20().isValid(s));
    }
}
