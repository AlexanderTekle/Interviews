import java.util.*;
public class TwoSum {
	
	public int[] solution(int [] nums, int target)
	{
		Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
		
		for (int i=0;i<nums.length;i++)
		{
			if (numbers.containsKey(target-nums[i]))
				return new int[] {numbers.get(target-nums[i]),i};
			numbers.put(nums[i], i);
		}
		return new int[2];
	}
				
	            

}
