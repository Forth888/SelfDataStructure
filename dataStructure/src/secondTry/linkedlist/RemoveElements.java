package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class RemoveElements {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val == val){
                pre.next = curr.next;
                curr = curr.next;
            }else{
                pre = curr;
                curr = curr.next;
            }
        }
        return dummyHead.next   ;
    }
}
