package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class DeleteDuplicates {
    public static void main(String[] args) {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = deleteDuplicates.deleteDuplicates(head);
        System.out.println(res.next.next.val);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null){
            if(cur.val == pre.val){
                cur = cur.next;
                pre.next = cur;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }

        return head;
    }


}
