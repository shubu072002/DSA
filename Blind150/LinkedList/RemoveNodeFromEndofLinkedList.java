package Blind150.LinkedList;

public class RemoveNodeFromEndofLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
