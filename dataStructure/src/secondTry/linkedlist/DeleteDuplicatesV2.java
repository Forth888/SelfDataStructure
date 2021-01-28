package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class DeleteDuplicatesV2 {

    public static void main(String[] args) {
        DeleteDuplicatesV2 deleteDuplicates = new DeleteDuplicatesV2();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode ans = deleteDuplicates.deleteDuplicates(head);
        System.out.println(ans.next.next.val);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = head;
        ListNode pre = dummyHead;
        int x = 0 ;
        while(curr !=null && curr.next != null){
            if(curr.val == curr.next.val){
                x = curr.val;
                curr = curr.next;
                while( curr != null && x == curr.val){
                    curr = curr.next;
                }
                pre.next = curr;
            }else{
                pre = curr;
                curr = curr.next;
            }
        }

        return dummyHead.next;
    }
}
