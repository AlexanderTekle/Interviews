//https://leetcode.com/problems/intersection-of-two-arrays/description/
//o(n)

import java.util.*;
public class IntersectionofTwoArrays {
	
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first = new HashSet<>();
        ArrayList<Integer> ret = new ArrayList<>();
        //HashSet<Integer> ret = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++)
        {
            first.add(nums1[i]);
        }
        
        for (int i=0;i<nums2.length;i++)
        {
            if (first.contains(nums2[i]))
                if (!ret.contains(nums2[i]))
                    ret.add(nums2[i]);
        }
        int ret2[] = new int[ret.size()];
        int i = 0;
        for (Integer num : ret)
        {
            ret2[i] = num;
            i++;
        }
       // Arrays.sort(ret2);
        return ret2;
        
    }

}
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
//O(n) runtime complexity
class IntersectionofTwoArraysII
{
    public int[] intersect(int[] nums1, int[] nums2) {
        
        List<Integer> first = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        
        for (int i=0;i<nums1.length;i++)
        {
            first.add(nums1[i]);
        }
        int i=0, z = 0;
        int q = nums2.length;
        while (i<q)
        {
            if (first.contains(nums2[z]))
            {
                ret.add(nums2[z]);
                first.remove(new Integer(nums2[z]));
                i--;
                q--;
            }
            z++;
            i++;
        }
        
        int[] solution = new int[ret.size()];
        i=0;

        for (Integer num : ret)
        {
            solution[i] = num;
            i++;
        }
        return solution;
    }
}
