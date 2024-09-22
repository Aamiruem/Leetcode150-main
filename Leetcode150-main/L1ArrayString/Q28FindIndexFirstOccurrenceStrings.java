
package L1ArrayString;

public class Q28FindIndexFirstOccurrenceStrings {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Q28FindIndexFirstOccurrenceStrings obj = new Q28FindIndexFirstOccurrenceStrings();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(obj.strStr(haystack, needle));

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(obj.strStr(haystack, needle));
    }
}
