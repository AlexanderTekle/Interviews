import java.util.*;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combined[] = new int[nums1.length + nums2.length];
        
        System.arraycopy(nums1,0,combined,0,nums1.length);
        System.arraycopy(nums2,0,combined,nums1.length,nums2.length);
        
        Arrays.sort(combined);
        
        if (combined.length%2==1)
            return combined[combined.length/2];
        return ((combined[combined.length/2] + combined[combined.length/2-1]) / 2.0);   
    }

}
