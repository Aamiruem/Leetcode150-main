package L1ArrayString;

import java.util.*;

public class Q58LengthOfLastWord {

    // O(n) time complexity, O(1) space complexity
    public static int lengthOfLastWord(String str) {
        // Trim any trailing or leading spaces from the string
        str = str.trim();
        int length = 0;

        // Start from the end of the string and move backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            // Check if the current character is not a space
            if (str.charAt(i) != ' ') {
                length++; // Increment the length of the last word
            } else if (length > 0) {
                // If we encounter a space after finding the last word, break the loop
                break;
            }
        }
        return length; // Return the length of the last word
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();
            
            int length = lengthOfLastWord(input);
            System.out.println("Length of the last word: " + length);
        }
    }
}
