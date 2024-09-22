//Algo Used: Stack
// TC: O N , SC: O N
package L7Stack;

import java.util.Stack;

public class SimplifyPath71 {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // Split the input path by "/"
        String[] components = path.split("/");

        // Traverse each component
        for (String component : components) {
            // Skip empty components and "." (current directory)
            if (component.equals("") || component.equals(".")) {
                continue;
            }
            // If "..", pop the stack if it's not empty (going back to the parent directory)
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push valid directory names onto the stack
                stack.push(component);
            }
        }

        // If stack is empty, return "/"
        if (stack.isEmpty()) {
            return "/";
        }

        // Construct the simplified path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.toString();
    }
    public static void main(String[] args) {

        String path = "/home/";
        String result = simplifyPath(path);
        System.out.println(result);
        // Output: /home
    }
}
