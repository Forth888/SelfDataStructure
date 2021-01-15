package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class ReverseList {

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = reverseList.reverseList(head);
        System.out.println(res.val);
    }

    public ListNode reverseList(ListNode head){
        if(head==null)
            return head;
        ListNode pre = null;
        ListNode cur = head;
        while(cur !=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
