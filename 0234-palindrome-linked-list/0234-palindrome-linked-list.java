class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

      
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        
        ListNode secondHalf = reverseList(slow.next);

      
        ListNode curr1 = head;
        ListNode curr2 = secondHalf;
        while (curr2 != null) {
            if (curr1.val != curr2.val) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
