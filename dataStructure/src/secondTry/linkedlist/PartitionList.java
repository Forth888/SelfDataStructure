package secondTry.linkedlist;

import secondTry.utils.ListNode;

import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode ans = partitionList.partition(head,3);
        System.out.println(ans.next.next.next.next.val);
    }
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return  head;
        ListNode low = new ListNode(0);
        ListNode ans  = low;
        ListNode high = new ListNode(0);
        ListNode ans2 = high;
        ListNode current = head;

        while(current != null){
            if(current.val < x){
                low.next = current;
                low = low.next;
            }else{
                high.next = current;
                high = high.next;
            }
            current = current.next;
        }
        high.next = null;
        low.next = ans2.next;
        return ans.next;
    }
}
