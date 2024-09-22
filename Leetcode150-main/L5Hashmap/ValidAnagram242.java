package L5Hashmap;

import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        ValidAnagram242 solution = new ValidAnagram242();
        System.out.println(solution.isAnagram(s, t)); // Output: true
        s = "rat";
        t = "cat";
        System.out.println(solution.isAnagram(s, t)); // Output: false
    }
}
