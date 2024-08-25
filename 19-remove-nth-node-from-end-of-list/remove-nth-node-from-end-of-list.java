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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=new ListNode(-1);
        int count=0;
        //finding number of nodes
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int x=0;
        curr=head;
        while(curr!=null&&x<count-n){
            x++;
            prev=curr;
            curr=curr.next;
        }
        // System.out.println(curr.next);
        // System.out.println(prev.val);
        // System.out.println(x);
        // System.out.println(head.next);
        if(x==(count-n) && prev.val!=-1){

            prev.next=curr.next;
        }
        else if(x==0 && prev.val==-1){
            return curr.next;
        }
        return head;
    }
}