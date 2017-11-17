//https://leetcode.com/problems/linked-list-cycle/description/
import java.util.*;

class ListNode
{
	int val;
	ListNode next;
	
	public ListNode(int val)
	{
		this.val = val;
		next = null;
	}
}
public class LinkedListCycle {
	//o(n) runtime o(n) space
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        
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
    public boolean hasCycle2(ListNode head)
    {
    		ListNode slow = head;
    		ListNode fast = head.next;
    		
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
