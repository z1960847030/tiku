package 题目2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();

//        int[] arr1 = {2,4,3};
//        int[] arr2 = {5,6,4};

//        int[] arr1 = {0};
//        int[] arr2 = {0};

        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        ListNode l1 = null;
        ListNode l2 = null;

        for (int i = 0; i < arr1.length; i++){
            list1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++){
            list2.add(arr2[i]);
        }
        if (list1.size()<list2.size()){
            for (int i = 0; i < arr2.length-arr1.length; i++){
                list1.add(0);
            }
        }
        if (list1.size()>list2.size()){
            for (int i = 0; i < arr1.length-arr2.length; i++){
                list2.add(0);
            }
        }

        for (int i = 0; i < arr1.length+1; i++) {
            if (i==arr1.length){
                if (solution.getCount()>0){
                    l1 = new ListNode(0);
                    System.out.println("["+l1.val+"]");
                    l2 = new ListNode(0);
                    System.out.println("["+l2.val+"]");
                    solution.addTwoNumbers(l1, l2);
                }

            }
            if (i<arr1.length){
                l1 = new ListNode((int)list1.get(i));
                System.out.println("["+l1.val+"]");
                l2 = new ListNode((int)list2.get(i));
                System.out.println("["+l2.val+"]");
                solution.addTwoNumbers(l1, l2);
            }
        }
    }
}