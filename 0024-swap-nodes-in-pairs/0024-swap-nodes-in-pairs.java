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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=new ListNode(0);
        ListNode m=prev;
        ListNode curr=head;
        ListNode nex=null;
        if(head!=null) nex=head.next;
        if(head==null || head.next==null) return head;

        while(curr!=null && nex!=null){
            curr.next=curr.next.next;
            nex.next=curr;
            prev.next=nex;
            prev=curr;
            curr=curr.next;
            if(curr==null || curr.next==null){
                return m.next;
            }
            else nex=curr.next;
        }

        return m.next;



        
    }
}