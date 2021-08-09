package 题目2方法2;

import java.util.ArrayList;

public class Solution {
    public ArrayList  addTwoNumbers(ArrayList list1,ArrayList list2){
        ArrayList<Object> list3 = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        int flag = carry;
        for (int i=0;i< list1.size();i++){
            if (i>list2.size()-1){
                list2.add(0);
            }
            int a = (int)(list1.get(i));
            int b = (int)(list2.get(i));
            sum = a + b + carry;
            carry = sum/10;
            int lastsum = sum % 10;
            sum = 0;
            list3.add(lastsum);
            flag = carry;
        }
        if (flag !=0){
            list3.add(flag);
        }
        System.out.println(list3);
        return list3;
    }

}
