package October.day6;
import java.util.*;


//1. Two Sum
//https://leetcode.com/problems/two-sum/submissions/


class Solution {
    public int[] twoSum(int[] nums, int target)
    {
       int[] res=new int[2];
       HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;

            }
            map.put(nums[i],i);
        }
        return res;
    }
}


//88. Merge Sorted Array
//https://leetcode.com/problems/merge-sorted-array/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=m-1;
        int j=n-1;
        int k=n+m-1;
        
        while(i>=0 && j>=0)
        {
            nums1[k--]=nums1[i]>nums2[j]? nums1[i--]:nums2[j--];
        }
       while(j>=0)
       {
           nums1[k--]=nums2[j--];
       }
    }
}