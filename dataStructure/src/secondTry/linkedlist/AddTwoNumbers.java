package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode head = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        head.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;
        ListNode ans = addTwoNumbers.addTwoNumbers(head,node4);
        System.out.println(ans.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode ansHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = ansHead;
        int carry = 0;
        while(p!=null || q!=null){
            int x = p!=null ? p.val : 0;
            int y = q!=null ? q.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p !=null) p = p.next;
            if(q !=null) q = q.next;
        }
        return ansHead.next;
    }
}
