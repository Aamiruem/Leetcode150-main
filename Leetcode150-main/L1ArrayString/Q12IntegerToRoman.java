package L1ArrayString;

public class Q12IntegerToRoman {
    public String intToRoman(int num) {
        int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int i = 0;
        String str = new String();
        while (num > 0) {
            if (num >= n[i]) {
                str = str + s[i];
                num -= n[i];
            } else {
                i++;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Q12IntegerToRoman obj = new Q12IntegerToRoman();
        int num = 1994;
        System.out.println(obj.intToRoman(num));

        num = 3749;
        System.out.println(obj.intToRoman(num));
    }
}
