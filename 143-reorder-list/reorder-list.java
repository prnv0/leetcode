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
    public void reorderList(ListNode head) {
        ListNode end=head;
        ListNode mid = new ListNode(-1);
        mid.next=head;
        while(end!=null&&end.next!=null){
            mid=mid.next;
            end=end.next.next;
        }
        ListNode rev=mid.next;
        if(end==null)
            mid.next=null;
        ListNode prev=null,temp;
        //creating reverse of second half
        while(rev!=null){
            temp=rev.next;
            rev.next=prev;
            prev=rev;
            rev=temp;
        }
        //prev is head of reverse
        //merging
        rev=prev;
        temp=null;
        ListNode nextrev;
        while(rev!=null&&head!=null){
            temp=head.next;
            head.next=rev;
            head=temp;
            nextrev=rev.next;
            rev.next=head;
            rev=nextrev;
        }
    }
}