package Blind150.LinkedList;

import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next=null;
    }

}

public class ReverseALinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = reverseList(head);

        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}
