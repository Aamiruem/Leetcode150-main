package L2TwoPointers;

public class Q392IsSubsequences {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp == s.length();
    }

    public static void main(String[] args) {

        Q392IsSubsequences obj = new Q392IsSubsequences();

        String s = "abc";

        String t = "ahbgdc";

        System.out.println(obj.isSubsequence(s, t));

    }
}
