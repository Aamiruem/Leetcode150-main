//Approach Used: Hashing
// TC: O N , SC: O 1
package L5Hashmap;

public class RansomNote383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        int[] hash = new int[26];

        // Fill hash array with counts of characters in magazine
        for (int i = 0; i < m; i++) {
            hash[ch2[i] - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (int i = 0; i < n; i++) {
            hash[ch1[i] - 'a']--;
            if (hash[ch1[i] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        RansomNote383 obj = new RansomNote383();
        System.out.println(obj.canConstruct(ransomNote, magazine)); // Expected: false
    }
}
