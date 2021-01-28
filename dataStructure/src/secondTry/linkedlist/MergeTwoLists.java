package secondTry.linkedlist;

import secondTry.utils.ListNode;

import java.util.regex.Matcher;

public class MergeTwoLists {

    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        head.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;
        ListNode ans = mergeTwoLists.mergeTwoLists(head,node4);

        System.out.println(ans.next.next.next.val);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);;
        ListNode head = dummyHead;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            head = head.next;
        }
        while(l1 != null){
            head.next = new ListNode(l1.val);
            l1 = l1.next;
            head = head.next;
        }
        while(l2 != null){
            head.next = new ListNode(l2.val);
            l2 = l2.next;
            head = head.next;
        }
        return dummyHead.next;
    }
}
