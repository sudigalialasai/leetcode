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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int count=1;
        ListNode temp=head;

        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        count=count-k;
        temp.next=head;
        
        while(count>0){
            temp=temp.next;
            count--;
        }
        head=temp.next;

        temp.next=null;
        return head;
        
    }
}