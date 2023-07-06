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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode nex=head.next;
        ListNode dum;
        head.next=null;
        dum=head;

        while(nex.next!=null){
            head=nex;
            nex=nex.next;
            head.next=dum;
            dum=head;



            
        }
        nex.next=dum;
        return nex;
        
        
        
        
        
    }
}