package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class ReverseKGroup {

    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode end = dummyNode;
        while(end.next != null){
            for(int i=0;i<k && end != null;i++){
                end = end.next;
            }
            if(end == null)
                break;

            ListNode next = end.next;
            end.next = null;
            ListNode start = pre.next;
            pre.next = reverse(start);

            start.next = next;
            pre = start;
            end = start;

        }

        return dummyNode.next;
    }

    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
