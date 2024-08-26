/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> map= new HashSet<>();
        ListNode curr=head;
        while(curr!=null){
            if(map.contains(curr))
                return true;
            map.add(curr);
            curr=curr.next;

        }
        return false;
    }
}