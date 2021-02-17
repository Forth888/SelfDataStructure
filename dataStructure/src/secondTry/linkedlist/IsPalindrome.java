package secondTry.linkedlist;

import secondTry.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;

        List<Integer> list = new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        if(list.size()==1)
            return true;
        int front = 0, back=list.size()-1;
        while(front<back){
            if(!list.get(front).equals(list.get(back)))
                return false;
            back--;
            front++;
        }
        return true;
    }
}
