package 题目1;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        int flag = 1;
        for (int i=0;i<nums.length-1;i++){
            for (int j=(i+1);j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                   index[0] = i;
                   index[1] = j;
                   flag = 0;
                }
            }
        }
        //如果没有对应结果，则进行以下操作
        if (flag==1){
            System.out.println("没有相应两整数相加等于目标值");
        }
        return index;
    }
}