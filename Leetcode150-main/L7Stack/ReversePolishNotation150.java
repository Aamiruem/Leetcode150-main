package L7Stack;

import java.util.Stack;

public class ReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" ->                     {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                    }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" ->                     {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b / a);
                    }
                default -> stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"};
        ReversePolishNotation150 obj = new ReversePolishNotation150();
        System.out.println(obj.evalRPN(tokens));
    }
}
