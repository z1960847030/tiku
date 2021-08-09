package 题目10;

public class Solution {
    boolean result = false;
    public boolean isMatch(String s, String p) {
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != '*') {
                if (s.equals(p)) {
                    result = true;
                }
            }
        }

        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) == '*'){
                System.out.println(p.charAt(i-1));
            }
        }





        System.out.println(result);
        return result;
    }
}
