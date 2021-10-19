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


//40. Combination Sum II
//https://leetcode.com/problems/combination-sum-ii/


class Solution1 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        combinations(0, candidates, target, ans, new ArrayList<>()); 
        return ans; 
    }
    private void combinations(int idx, int[] arr, int target,                               List<List<Integer>>ans, List<Integer> ds)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(ds)); 
            return; 
        }
        
        for(int i = idx; i < arr.length;i++)
        {
            if(i > idx && arr[i] == arr[i-1]) continue; 
            if(arr[i]>target) break; 
            
            ds.add(arr[i]); 
            combinations(i+1, arr, target - arr[i], ans, ds); 
            ds.remove(ds.size() - 1); 
        }
    }
}


//131. Palindrome Partitioning
//https://leetcode.com/problems/palindrome-partitioning/


class Solution3 {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        find(0,s,path,res);
        return res;
    }
    
    void find(int idx,String s,List<String> path,List<List<String>>res)
    {
        if(idx==s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();++i)
        {
            if(isPalindrome(s,idx,i))
            {
                path.add(s.substring(idx,i+1));
                find(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end)
    {
        while(end>=start)
        {
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}


