package L1ArrayString;

public class Q6ZigZagConversions {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;

        }
        StringBuilder result = new StringBuilder();
        
        // for (int i = 0; i < rows.length; i++) {
        //     result.append(rows[i]);
        //     result.append(" ");
        // }

        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();

    }
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;
        Q6ZigZagConversions obj = new Q6ZigZagConversions();
        System.out.println(obj.convert(s, numRows));

        s = "LEETCODEISHIRING";
        numRows = 4;
        System.out.println(obj.convert(s, numRows));

        s = "A";
        numRows = 1;
        System.out.println(obj.convert(s, numRows));

    }

}
