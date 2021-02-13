package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(8);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        ListNode ans = removeNthFromEnd.removeNthFromEnd(head,1);
        System.out.println(ans.next.next.next.next.val);
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null)
            return head;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode end = head;
        for(int i=0;i<n;i++){
            end = end.next;
        }

        ListNode frontNode = dummyNode;
        while(end != null){
            frontNode = frontNode.next;
            end = end.next;
        }

        ListNode next = frontNode.next.next;
        frontNode.next = next;
        return dummyNode.next;
    }
}
