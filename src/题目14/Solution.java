package 题目14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                i--;
            }
        }

        System.out.println(result);
        return result;
    }
}
