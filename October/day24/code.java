
//704. Binary Search
//https://leetcode.com/problems/binary-search/


class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
                
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}


//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


class Solution1 {
    public int findMin(int[] num)
    {
         if (num == null || num.length == 0)
         {
            return 0;
         }
        if (num.length == 1)
        {
            return num[0];
        }
        int start = 0;
        int end = num.length - 1;
        while (start < end) 
        {
            int mid = (start + end)/2;
            if (mid > 0 && num[mid] < num[mid - 1])
            {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end])
            {
                start = mid + 1;
            } else 
            {
                end = mid - 1;
            }
        }
        return num[start];
    }
}