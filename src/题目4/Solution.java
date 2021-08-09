package 题目4;

import java.util.ArrayList;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        double median = 0.0;
        ArrayList<Object> list1 = new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }

        ArrayList<Object> list2 = new ArrayList<>();
        for (int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }

        for (int i=0;i<list2.size();i++){
            list1.add(list2.get(i));
        }
        //合并数列
        System.out.println("合并后："+list1);

        if (list1.size() == 0){
            median = 0.0;
            System.out.println("中数为："+median);
            return 0.0;
        }

        if (list1.size()>0) {
            //冒泡排序
            for (int i = 1; i < list1.size(); i++) {
                for (int j = 0; j < list1.size(); j++) {
                    if (((int) list1.get(j)) > ((int) list1.get(i))) {
                        int temp = (int) list1.get(j);
                        list1.set(j, list1.get(i));
                        list1.set(i, temp);
                    }
                }
            }
            System.out.println(list1);

            if ((list1.size() % 2) == 0) {
                double sum = (double) (int) list1.get(list1.size() / 2) + (double) (int) list1.get(list1.size() / 2 - 1);
                median = sum / 2;
                System.out.println(median);
            } else if ((list1.size() % 2) == 1) {
                median = (double) (int) list1.get(list1.size() / 2);
                System.out.println("中数为："+median);
            }
        }

        return median;
    }
}
