package 题目2;

import java.util.ArrayList;



class Solution{
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        carry = getCount();
        while(l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;
            setCount(carry);
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            System.out.println("------------------");
            System.out.println(root.next.val);
            System.out.println("------------------");
        }
        return root.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
