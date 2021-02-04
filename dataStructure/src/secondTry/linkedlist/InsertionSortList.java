package secondTry.linkedlist;

import secondTry.utils.ListNode;

import java.io.InputStream;

public class InsertionSortList {
    /**
     * 插入排序
     * @param args
     */
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
        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode ans = insertionSortList.insertionSortList(head);
        System.out.println(ans.next.val);
    }

    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode curr = head.next;
        ListNode lastSorted = head;
        while(curr != null){
            if(lastSorted.val < curr.val){
                lastSorted = lastSorted.next;
            }else{
                ListNode pre = dummyNode;
                while(pre.next.val<=curr.val){
                    pre = pre.next;
                }
                lastSorted.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
            }

            curr = lastSorted.next;
        }

        return dummyNode.next;

    }
}
