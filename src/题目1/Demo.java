package 题目1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;

        int[] nums = {3,2,4};
        int target = 6;

//        int[] nums = {3,3};
//        int target = 6;


        int[] index = new int[2];
        Solution solution = new Solution();
        index = solution.twoSum(nums,target);
        ArrayList<Object> list = new ArrayList<>();
        for (int i=0;i<index.length;i++){
            list.add(index[i]);
        }
        System.out.println(list);
    }
}
