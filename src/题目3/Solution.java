package 题目3;

import java.util.ArrayList;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        int everlenth = 0;
        int mineverlenth = 0;
        char[] arr1 =  s.toCharArray();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        int[] arr4 = new int[1024];
        for (int i=0;i<s.length()-1;i++){
            System.out.println("--------------------------------");
            list2.removeAll(list2);
            for (int j=i+1;j<s.length();j++){
                if (arr1[i]==arr1[j]){
                    System.out.println("第"+(i+1)+"位"+arr1[i]+"和第"+(j+1)+"位"+arr1[j]+"一样");
                    //所有相同数据位之间的长度
                    everlenth = j -i;
                    System.out.println("每个相同数据位之间的距离为："+everlenth);
                    list2.add(everlenth);
                    int[] arr3 = new int[list2.size()];
                    arr4 = arr3;
                    for (int m=0;m<list2.size();m++){
                        arr3[m] = (int) list2.get(m);
                    }
                    for (int n=1;n<arr3.length;n++){
                        for (int l=0;l<arr3.length;l++){
                            if (arr3[l]>arr3[n]){
                                int temp = arr3[l];
                                arr3[l]=arr3[n];
                                arr3[n]=temp;
                            }
                        }
                    }
//                    mineverlenth = arr3[0];
//                    list1.add(mineverlenth);
                }
            }
            System.out.println(list2);
            mineverlenth = arr4[0];
            list1.add(mineverlenth);
//            System.out.println(list2);
//            System.out.println("本轮最小值为"+mineverlenth);
        }
//        System.out.println(list1);
        int maxlenth = 0;
        int[] arr2 = new int[list1.size()];
        for (int i=0;i<list1.size();i++){
            arr2[i] = (int) list1.get(i);
        }

        for (int i=1;i<arr2.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr2[j]>arr2[i]){
                    int temp = arr2[j];
                    arr2[j]=arr2[i];
                    arr2[i]=temp;
                }
            }
        }
//        for (int j=0;j<arr2.length;j++){
//            System.out.println(arr2[j]);
//        }
        if (arr2.length-1>0){
            maxlenth = arr2[arr2.length-1];
            System.out.println("--------------------------------");
            System.out.println(maxlenth);
        }else{
            maxlenth = 0;
            System.out.println("--------------------------------");
            System.out.println(maxlenth);
        }

        return maxlenth;
    }
}
