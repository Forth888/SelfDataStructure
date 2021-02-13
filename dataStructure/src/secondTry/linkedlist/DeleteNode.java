package secondTry.linkedlist;

import secondTry.utils.ListNode;

public class DeleteNode {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode head){
        head.val = head.next.val;
        head.next = head.next.next;
    }
}
