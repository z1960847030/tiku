package 题目1;

public class Demo02 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        int index = 1;
        for (int i=0;i<nums.length-1;i++){
            for (int j=(i+1);j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    System.out.println("["+i+","+j+"]");
                    System.out.println("数组第"+(i+1)+"和第"+(j+1)+"个数相加等于目标值"+target);
                    index = 0;
                }
            }
        }
        //如果没有对应结果，则进行以下操作
        if (index==1){
            System.out.println("没有相应两整数相加等于目标值");
        }

    }
}
