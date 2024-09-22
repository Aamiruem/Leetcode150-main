package L5Hashmap;

import java.util.HashMap;

public class wordPattern290 {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hash = new HashMap<>();
        String[] str = s.split(" ");

        if (pattern.length() != str.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String st = str[i];
            if (!hash.containsKey(c)) {
                if (hash.containsValue(st)) {
                    return false;
                }
                hash.put(c, st);
            } else if (!hash.get(c).equals(st)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String pattern = "abba";
        String s = "dog cat cat dog";

        wordPattern290 obj = new wordPattern290();
        System.out.println(obj.wordPattern(pattern, s)); // true
        
        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(obj.wordPattern(pattern, s)); // false
    }
}
