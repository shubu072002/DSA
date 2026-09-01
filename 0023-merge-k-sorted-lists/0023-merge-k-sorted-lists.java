/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null){
            return null;
        }
        return mergeListHelper(lists,0,lists.length-1);
    }
    public ListNode mergeListHelper(ListNode[] lists, int start, int end){
        if(start==end){
            return lists[start];
        }
        if(start+1==end){
            return merge(lists[start],lists[end]);
        }
        int mid = start + (end-start)/2;
        ListNode left = mergeListHelper(lists,start,mid);
        ListNode right = mergeListHelper(lists,mid+1,end);

        return merge(left,right);
    }
    public ListNode merge(ListNode n1, ListNode n2){
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        ListNode temp;
        if(n1.val<n2.val){
          temp = n1;
          n1=n1.next;
        }
        else{
            temp=n2;
            n2=n2.next;
        }
        ListNode newNode = temp;
        while(n1!=null && n2!=null){
            if(n1.val<n2.val){
               temp.next=n1;
               n1=n1.next;
            }
            else{
                temp.next = n2;
                n2=n2.next;
            }
            temp = temp.next;
        }
        if(n2==null){
            temp.next= n1;
        }
        if(n1==null){
            temp.next= n2;
        }
        return newNode;
    }
}