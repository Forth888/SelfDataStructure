package secondTry.linkedlist;

import secondTry.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReorderList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(head);

    }

    public void reorderList(ListNode head){
            if(head == null)
                return;
            ListNode temp = head;
            int x =0;
            while(temp!=null) {
                x++;
                temp=temp.next;
            }
            List<ListNode> list = new ArrayList<>();
            Stack<ListNode> stack = new Stack<>();
            temp=head;
            for(int i=0;temp != null;i++){
                if(i<x/2){
                    list.add(temp);
                }else{
                    stack.push(temp);
                }
                temp = temp.next;
            }
            int y =0;
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            while(!list.isEmpty() && !stack.isEmpty() && y<list.size()) {
                curr.next = list.get(y);
                curr.next.next = stack.pop();
                curr = curr.next.next;
                y++;
            }
            while(!stack.isEmpty()) {
                curr.next = stack.pop();
                curr = curr.next;
            }
            curr.next =null;
            head = dummy.next;

            System.out.println(head.next.next.val);
    }
}
