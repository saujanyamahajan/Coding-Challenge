package September.Day 3;

import java.util.*;
class Solution {

    //1. two sum
    //https://leetcode.com/problems/two-sum/submissions/

    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[1]=i;
                res[0]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }


    

}
    

