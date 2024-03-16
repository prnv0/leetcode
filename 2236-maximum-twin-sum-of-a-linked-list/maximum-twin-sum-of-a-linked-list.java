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
    public int pairSum(ListNode head) {
        ListNode current=head,prev=null;
        ListNode slow=head,fast=head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        current=slow.next;
        ListNode next=slow.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        current=head;
        int big=0;
        while(prev!=null){
            if(current.val+prev.val>big)
                big=current.val+prev.val;
            prev=prev.next;
            current=current.next;
        }
        return big;
        
    }
}