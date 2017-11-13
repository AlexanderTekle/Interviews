//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingWater {
	
	public int solution(int[] bars)
	{
		int ret = 0;
		int size = bars.length;
		
		for (int i = 1; i<size-1; i++)
		{
			int maxLeft = 0, maxRight = 0;
			
			//find the max left wall
			for (int q = i-1; q >= 0; q--)
			{
				if (bars[q] > maxLeft)
					maxLeft = bars[q];
			}
			
			//find the max right wall
			for (int q=i+1; q<size; q++)
			{
				if (bars[q] > maxRight)
					maxRight = bars[q];
			}
			
			//arithmetic
			int add = Math.min(maxLeft, maxRight) - bars[i];
			if (add > 0)
				ret += add;
		}
		return ret;
	}

}
