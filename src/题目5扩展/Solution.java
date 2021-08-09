package 题目5扩展;

import java.util.ArrayList;

public class Solution {
    public String longestPalindrome(String s) {

        String result = "a";
        char[] arr1 = s.toCharArray();
        System.out.println(arr1);
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        for (int i=0; i<s.length()-1;i++){
            for (int j=i+1; j<s.length();j++){
                if (arr1[i]==arr1[j]){
                    int index1 = i;
                    int index2 = j;
                    list1.add(i);
                    list2.add(j);
                }
            }
        }
        for (int i=0;i<list1.size();i++){
           int lenth =  (int)list2.get(i)-(int)list1.get(i)+1;
           list3.add(lenth);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


        if (list3.size()==0){
             result = String.valueOf(s.charAt(0));
        }

        int flag = 0;

        if (list3.size()>0){
            int max = (int)list3.get(0);
            for (int i=0;i<list3.size();i++){
                if ((int)list3.get(i)>max){
                    max = (int)list3.get(i);
                    flag = i;
                }
            }
            int Stringlenth = (int)list1.get(flag)+(int)list3.get(flag);
//            for (int i=(int)list1.get(flag);i<Stringlenth;i++){
//                list4.add(arr1[i]);
//            }
            result = s.substring((int)list1.get(flag),Stringlenth);
        }
        System.out.println(result);

        return result;
    }
}
