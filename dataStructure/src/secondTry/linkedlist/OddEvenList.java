package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class OddEvenList {

    public static void main(String[] args) {
        OddEvenList oddEvenList = new OddEvenList();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode ans = oddEvenList.oddEvenList(head);
        System.out.println(ans.next.val);
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode odd = head, even = head.next, evenHead = head.next;
        while(even !=null && even.next !=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
