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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current=head;
        ListNode prev=head;
        int c=0;
        while(current!=null){
            c++;
            current=current.next;
        }
        if(c==1){
            head=null;
            return head;
        }
            
        c=c/2;
        current=head;
        for(int i=0;i<c;i++){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;
    }
}