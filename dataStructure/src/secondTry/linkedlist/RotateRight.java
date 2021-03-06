package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class RotateRight {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        RotateRight rotateRight = new RotateRight();
        System.out.println(1%3);
        ListNode ans = rotateRight.rotateRight(head,2);
        System.out.println(ans.val);
    }

    public ListNode rotateRight(ListNode head, int k){
        if(head == null)
            return head;
        int length = 1;
        ListNode tail= head;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }

        int temp = k%length;
        if(temp==0) return head;

        ListNode pre = head;
        for(int i=0;i<length-temp-1;i++){
            pre = pre.next;
        }
        System.out.println(pre.val);
        ListNode res= pre.next;
        pre.next = null;
        tail.next = head;
        return res;

    }
}
