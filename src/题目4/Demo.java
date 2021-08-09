package 题目4;

public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};

//        int[] nums1 = {0,0};
//        int[] nums2 = {0,0};

//        int[] nums1 = {};
//        int[] nums2 = {1};

//        int[] nums1 = {2};
//        int[] nums2 = {};

//        int[] nums1 = {};
//        int[] nums2 = {};

        Solution solution = new Solution();
        solution.findMedianSortedArrays(nums1,nums2);

    }
}
