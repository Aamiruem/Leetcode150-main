package L1ArrayString;

import java.util.Arrays;

public class Q14LongestCommonPrefix {

    public static String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int n = Math.min(first.length(), last.length());
        for (int i = 0; i < n; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            } else {
                ans.append(first.charAt(i));
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String str[] = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(longestCommonPrefix(str));
    }
    // Time Complexity: O(N logN) + O(N) = O(N logN)
    // Space Complexity: O(1)
}
