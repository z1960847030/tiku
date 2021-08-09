package 题目6;

import java.util.Vector;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        char[] arr = new char[s.length()];
        int index = 0;
        int head = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int x = i;
            while (x < s.length()) {
                arr[index] = s.charAt(x);
                index++;
                if (i == 0) {
                    x += head;
                    continue;
                }
                if (i == numRows - 1) {
                    x += head;
                    continue;
                }
                if ((x + i) % head == 0) {
                    x = x + 2 * i;
                    continue;
                }
                x = x + head - 2 * i;
            }
        }
        System.out.println(arr);
        return String.valueOf(arr);
    }
}
