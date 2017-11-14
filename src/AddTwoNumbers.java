//https://leetcode.com/problems/add-two-numbers/description/
//o(n)
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
public class AddTwoNumbers {
	public ListNode solution(ListNode l1, ListNode l2)
	{
	       int carry = 0;
	        ListNode ret2 = new ListNode(0);
	        ListNode ret = ret2;
	        ListNode temp1 = l1;
	        ListNode temp2 = l2;
	        int i = 0;
	        
	        while (temp1 != null || temp2 != null)
	        {
	            if (temp1 == null && temp2 != null)
	            {
	                ret.next = new ListNode((temp2.val + carry)%10);
	                ret = ret.next;
	                carry = (temp2.val+carry)/10;
	                temp2 = temp2.next;
	            }
	            else if (temp2 == null && temp1 !=null)
	            {
	                ret.next = new ListNode((temp1.val + carry)%10);
	                ret = ret.next;
	                carry = (temp1.val + carry)/10;
	                temp1 = temp1.next;
	            }
	            else
	            {
	                ret.next = new ListNode((temp1.val + temp2.val + carry)%10);
	                ret = ret.next;
	                carry = (temp1.val + temp2.val + carry)/10;
	                temp1=temp1.next;
	                temp2=temp2.next;
	            }
	            //ret.val = i;
	        }
	        if (carry>0) {
	            ret.next = new ListNode(carry);
	            ret = ret.next;
	        }
	        
	        return ret2.next;
	        
	    }
}
