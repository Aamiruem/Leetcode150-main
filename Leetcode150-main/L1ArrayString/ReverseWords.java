

// package L1ArrayString;

// public class ReverseWords {
//     public static String reverseWords(String str) {
//         // Trim the input string and split it into words
//         String[] words = str.trim().split("\\s+");

//         // Initialize a StringBuilder to build the reversed string
//         StringBuilder reversedString = new StringBuilder();

//         // Loop through the words array in reverse order
//         for (int i = words.length - 1; i >= 0; i--) {
//             reversedString.append(words[i]);
//             if (i != 0) { // Add a space between words, but not after the last word
//                 reversedString.append(" ");
//             }
//         }

//         // Convert StringBuilder to a string and return it
//         return reversedString.toString();
//     }

//     public static void main(String[] args) {
//         String input = "  Hello World  ";
//         String result = reverseWords(input);
//         System.out.println("Reversed words: \"" + result + "\"");
//     }
// }










package L1ArrayString;

public class ReverseWords {
    public static String reverseWords(String str) {
        // Trim the input string and split it into words
        String[] words = str.trim().split("\\s+");

        // Use StringBuilder for efficient string concatenation
        StringBuilder out = new StringBuilder();

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            out.append(words[i]);
            if (i > 0) {
                out.append(" "); // Add a space between words but not after the last word
            }
        }

        // Convert StringBuilder to a string and return it
        return out.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World from OpenAI"; // Example input string
        String reversed = reverseWords(str); // Call the reverseWords method
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
