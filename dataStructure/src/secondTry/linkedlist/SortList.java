package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class SortList {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        ListNode head = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode ans = sortList.sortList(head);
        System.out.println(ans.next.val);
    }

    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }

    public ListNode sortList(ListNode head,ListNode tail){
        if(head == null )
            return head;
        if(head.next == tail){
            head.next = null;
            return head;
        }

        ListNode slow = head, fast = head;
        while(fast != tail){
            slow = slow.next;
            fast = fast.next;
            if(fast!=tail)
                fast = fast.next;
        }
//        System.out.println("---"+slow.val);
        ListNode mid = slow;
        ListNode list1 = sortList(head,mid);
        ListNode list2 = sortList(mid,tail);
        ListNode sortedList = merge(list1,list2);
        return sortedList;
    }

    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode, temp1 = list1, temp2 = list2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1 != null){
            temp.next = temp1;
        }
        if(temp2 != null) {
            temp.next = temp2;
        }
        return dummyNode.next;
    }
}
