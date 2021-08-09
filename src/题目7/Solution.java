package 题目7;

import java.util.ArrayList;

class Solution {
    public int reverse(int x) {
        int pow = (int) Math.pow(2,31);
        int abs = Math.abs(x);
        if (abs > pow){
            return 0;
        }
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        char temp = 't';
//        if (chars[0] == '-'){
//            temp = chars[1];
//            chars[1] = chars[3];
//            chars[3] = temp;
//        }
        if (chars[0] == '-'){
            for (int i = 1; i < chars.length/2+1; i++) {
            temp = chars[i];
            chars[i] = chars[chars.length-i];
            chars[chars.length-i] = temp;
            }
        }
        if (chars[0] != '-'){
            for (int i = 0; i < chars.length/2; i++) {
                temp = chars[i];
                chars[i] = chars[chars.length-1-i];
                chars[chars.length-1-i] = temp;
            }
        }

        String s1 = String.valueOf(chars);
        System.out.println(s1);
        int result = 0;
        try {
            // 数字转换
            result = Integer.parseInt(s1);
        } catch (Exception e) {
            System.out.println("转化后的int数据超范围");
        }
        System.out.println(result);
        return result;
    }
}
