public class Conversion_Zigzag {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; // Edge case handle for single row

        StringBuilder ans[] = new StringBuilder[numRows];

        // Initialize each StringBuilder to avoid null pointer exceptions
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            // Going down through rows
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index].append(s.charAt(i++));
            }
            // Going up diagonally (zigzag pattern)
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index].append(s.charAt(i++));
            }
        }

        // Combine all rows into one result
        StringBuilder res = new StringBuilder();
        for (StringBuilder str : ans) {
            res.append(str);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Conversion_Zigzag converter = new Conversion_Zigzag();
        String s = "PAYPALISHIRING";
        int numRows = 3; // Set the number of rows as needed

        String result = converter.convert(s, numRows);
        System.out.println(result);
    }
}
