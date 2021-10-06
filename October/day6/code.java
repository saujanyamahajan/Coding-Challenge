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


class Solution1 {
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


//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/


class Solution2 {
    public List<Integer> findDuplicates(int[] nums)
    {
        ArrayList<Integer> res=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        for(int i=0;i<nums.length;i++)
        {
            if( map.get(nums[i])!=null && map.get(nums[i])>1)
            {
                res.add(nums[i]);
                map.remove(nums[i]);
            }
        }
        
        return res;
    }
}


//Generate Parentheses 
//https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1#


class Solution3 {
    
    public void solve(int open,int close,String op,List<String>res) 
    {
        if(open==0 && close==0)
        {
            res.add(op);
            return ;
        }
        if(open!=0)
        {
            String op1=op+"(";
           // res.add("(");
            solve(open-1,close,op1,res);
        }
        if(close>open)
        {
            String op2=op+")";
            //res.add(")");
            solve(open,close-1,op2,res);
        }
        return;
    }
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> res=new ArrayList<>();
        int open=n;
        int close=n;
        String op="";
        
        solve(open,close,op,res);
        return res;
    }
}


//Print N-bit binary numbers having more 1s than 0s 
//https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1#


class Solution4 {
    void solve(int ones,int zeros,int n,String op,ArrayList<String> res)
    {
        if(ones+zeros==n)
        {
            res.add(op);
            return;
        }
        if(ones!=n)
        {
            String op1=op;
            op1=op1+"1";
            solve(ones+1,zeros,n,op1,res);
        }
        if(ones>zeros)
        {
            String op2=op;
            op2=op2+"0";
            solve(ones,zeros+1,n,op2,res);
        }
        return;
    }
    
    ArrayList<String> NBitBinary(int n)
    {
        // code here
        ArrayList<String> res=new ArrayList<String>() ;
        int ones=0;
        int zeros=0;
        String op="";
        solve(ones,zeros,n,op,res);
        return res;
    }
}


//Josephus Problem | Game of Death in a circle | Execution in Circle
//https://practice.geeksforgeeks.org/problems/josephus-problem/1#


class Solution5
{
//    public int solve(int n, int k)
//    {
//         if(n==1)
//         {
//             return 0;
//         }
//         else
//         {
//             return(solve(n-1,k)+k)%n;
//         }
//    }
   public int josephus(int n, int k)
    {
        //Your code here
        
       // return solve(n,k)+1;

       int ans=0;
       for(int i=1;i<=n;i++)
       {
           ans=(ans+k)%i;
       }
       return ans+1;
    }
    
}