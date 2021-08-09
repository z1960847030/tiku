package 题目2方法2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();

//        int[] arr1 = {2,4,3};
//        int[] arr2 = {5,6,4};

//        int[] arr1 = {0};
//        int[] arr2 = {0};

        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        //将数组转为集合，方便后续扩张个数，因为数组无法扩张容量
        for (int i=0;i<arr1.length;i++){
            list1.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            list2.add(arr2[i]);
        }
        Solution solution = new Solution();
        solution.addTwoNumbers(list1,list2);

    }


}
