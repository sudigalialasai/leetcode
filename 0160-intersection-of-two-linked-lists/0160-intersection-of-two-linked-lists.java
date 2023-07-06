/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA,l2=headB;
        if(headA==null && headA.next==null) return headA;
        if(headB==null && headB.next==null) return headB;

        while(l1!=null && l2!=null){
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null && l2!=null){
            l1=headB;
            while(l2!=null){
                l1=l1.next;
                l2=l2.next;
            }  
            l2=headA;  
        }
        else if(l1!=null && l2==null){
            l2=headA;
            while(l1!=null){
                l1=l1.next;
                l2=l2.next;
            } 
            l1=headB;   

        }
        else{
            l1=headA;
            l2=headB;
        }
        while(l1 != null && l2 != null && l1 != l2){
            l1 =l1.next;
            l2=l2.next;

        }

        return l1;
        
    }
}