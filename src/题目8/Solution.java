package 题目8;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int myAtoi(String s) {

        String s2 = s.trim();


        int result =0 ;
        int index = 0;
        int multiple = 1;
        List<Object> list = new ArrayList<>();
        char[] chars = s2.toCharArray();

        while(index<s2.length()){
            if (s2.charAt(index) == '-'){
                multiple = -1;
                break;
            }
            if (s2.charAt(index) == '+'){
                multiple = 1;
                break;
            }
            index++;
        }


        for (int i = 0; i < s2.length(); i++) {
            try {
                int indexvalue = Integer.parseInt(String.valueOf(s2.charAt(i)));
                list.add(indexvalue);
            } catch (NumberFormatException e) {
                list.add("s");
            }
        }

        if (index>1&&list.get(0)=="s"){
            multiple = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "s"){
                list.remove(list.get(i));
                i=0;
            }
        }
        if (list.get(0) == "s"){
            list.remove(list.get(0));
        }

        String[] str = new String[list.size()];
        String str2 = "";
        for (int i = 0; i < list.size(); i++) {
            str[i] = String.valueOf(list.get(i));
            str2 = str2 + str[i];
        }

        int i = 0;
        if (multiple==1){
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException e){
                i = (int) (Math.pow(2,31)-1);
            }
        }
        if (multiple==-1){
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                i = (int) -Math.pow(2,31);
            }
        }

        System.out.println(i);
        result = i*multiple;
        System.out.println(result);

        return result;
    }
}
