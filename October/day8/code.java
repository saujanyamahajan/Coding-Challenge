package October.day8;
import java.util.*;


//350. Intersection of Two Arrays II
//https://leetcode.com/problems/intersection-of-two-arrays-ii/


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer>helper =new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                j++;  
            }
            else if(nums1[i]<nums2[j])
            {
                i++;   
            }
            else
            {
                helper.add(nums1[i]);
                i++;
                j++;
            }
        }
        int n=helper.size();
        int[] res =new int[n];
        
        for(int z=0;z<n;z++)
        {
            res[z]=helper.get(z);
        }
            
        return res;
    }
}