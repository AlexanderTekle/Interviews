//https://leetcode.com/problems/reverse-linked-list-ii/description/



public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while (m < n)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            m++;
        }
        head = prev;
        return head;
        
    }

}
