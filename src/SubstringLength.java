//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//o(n) run time
import java.util.*;
public class SubstringLength {
	public int solution(String s)
	{
        int ans = 0, i = 0, q = 0;
		HashSet<Character> letters = new HashSet<>();
		
		while (i < s.length() && q < s.length())
		{
			if (!letters.contains(s.charAt(q)))
			{
				letters.add(s.charAt(q));
				q++;
				ans = Math.max(ans, q-i);
			}
			else {
                letters=new HashSet<>();
				i++;
				q=i;
			}
		}
		return ans;   
	}
}
