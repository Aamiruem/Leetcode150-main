package L1ArrayString;

public class Q58LengthOfLastWords {

    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Q58LengthOfLastWords obj = new Q58LengthOfLastWords();
        String s = "Hello World";
        System.out.println(obj.lengthOfLastWord(s));
    }
}
