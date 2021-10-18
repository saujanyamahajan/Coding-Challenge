package October.day18;
import java.util.*;


//39. Combination Sum
//https://leetcode.com/problems/combination-sum/


class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int B) {
         List<List<Integer>> ans=new ArrayList<>();
        find(0,arr,B,ans,new ArrayList<>());
        return ans;
    }
    
    
    static void find(int idx,int[] arr, int B,List<List<Integer>> ans,List<Integer> ds)
    {
        if(idx==arr.length)
        {
            if(B==0)
            {
                ans.add(new ArrayList<>(ds));    
            }    
            return;
        }
        if(arr[idx]<=B)
        {
            ds.add(arr[idx]);
            find(idx,arr,B-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
            
        }
        find(idx+1,arr,B,ans,ds);
    }
    
}