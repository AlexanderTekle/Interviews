//https://leetcode.com/problems/linked-list-cycle/description/
import java.util.*;

class ListNode2
{
	int val;
	ListNode2 next;
	
	public ListNode2(int val)
	{
		this.val = val;
		next = null;
	}
}
public class LinkedListCycle {
	//o(n) runtime o(n) space
    public boolean hasCycle(ListNode2 head) {
        Set<ListNode2> nodes = new HashSet<>();
        
        while(head != null)
        {
            if (nodes.contains(head))
                return true;
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
    //better solution
    //o(n) time and o(1) space
    public boolean hasCycle2(ListNode2 head)
    {
    		ListNode2 slow = head;
    		ListNode2 fast = head.next;
    		
    		while (slow != fast)
    		{
    			if (fast == null || fast.next == null)
    				return false;
    			slow = slow.next;
    			fast = fast.next.next;
    		}
    		return true;
    }
}
