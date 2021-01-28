package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class SwapPairs {
    public static void main(String[] args) {
        SwapPairs swapPairs = new SwapPairs();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode ans = swapPairs.swapPairs(head);
        System.out.println(ans.next.next.val);
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return head;
        ListNode dummyNdoe = new ListNode(0);
        dummyNdoe.next = head;
        ListNode curr = head;
        ListNode pre = dummyNdoe;
        while(curr !=null && curr.next != null){
            ListNode next = curr.next.next;
            ListNode node1 = curr.next;
            ListNode node2 = curr;
            pre.next = node1;
            node1.next = node2;
            node2.next = next;
            pre = node2;
            curr = next;
        }
        return dummyNdoe.next;
    }
}
