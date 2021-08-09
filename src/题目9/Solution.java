package 题目9;

class Solution {
    public boolean isPalindrome(int x) {
        boolean result = true;

        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        if (0 <= x & x < 10){
            result = true;
        }
        if (chars[0] == '-'){
            result = false;
        }

        for (int i = 0; i < chars.length; i++)
            if (chars[i]!=chars[chars.length-1-i]){
                result = false;
            }

        System.out.println(result);
        return result;

    }
}
