package October.day5;
import java.util.*;
public class code
{

//Permutation with Spaces 
//https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1#

    void solve(String ip,String op,ArrayList<String>res)
    {
         if(ip.length()==0)
         {
             res.add(op);
             return;
         }
         String op1=op;
         String op2=op;
         
         op1=op1+ip.charAt(0);
         op2=op2+" "+ip.charAt(0);
         
         ip=ip.substring(1);
         solve(ip,op1,res);
         solve(ip,op2,res);
         return;
         
    }
    ArrayList<String> permutation(String S){
        // Code 
        ArrayList<String> res=new ArrayList<>();
        String ip=S.substring(0,S.length());
        String op=S.substring(0,1);
        
        ip=ip.substring(1);
        solve(ip,op,res);
        Collections.sort(res);
        return res;        
    }



    //70. Climbing Stairs
    //https://leetcode.com/problems/climbing-stairs/


    public int climbStairs(int n) {
        int[] dp=new int[n+1];
         dp[0]=1;
         dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
   

//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/


    public boolean containsDuplicate(int[] arr) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if( map.get(arr[i])>1)
            {
                return true;
            }
        }
        return false;
        
//   
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             if(set.contains(arr[i]))
//             {
//                 return true;
//             }
//             else
//             {
//                 set.add(arr[i]);
//             }
//         }
//         return false;
        
    }


    //217. Contains Duplicate
    //https://leetcode.com/problems/maximum-subarray/

    public int maxSubArray(int[] nums)
    {
        int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }



        //784. Letter Case Permutation
    //https://leetcode.com/problems/letter-case-permutation/

    public List<String> letterCasePermutation(String s)
    {
        List<String> res = new ArrayList<>();
        solve(s,"",res);
        //Collections.sort(res);
        return res;
    }
    public void solve(String ip,String op,List<String>res)
    {
        if(ip.length()==0)
        {
            res.add(op);
            return;
        }
        String op1=new String(op);
        String op2=new String(op);
        char c=ip.charAt(0);
        
        if(Character.isAlphabetic(c))
        {
            char ch1=Character.toLowerCase(c);
            op1=op1+ch1;
            
            char ch2=Character.toUpperCase(c);
            op2=op2+ch2;
            
            ip= ip.substring(1);

            solve(ip,op1,res);
            solve(ip,op2,res);
        }
        else
        {
            op1=op1+c;
            ip = ip.substring(1);
            solve(ip,op1,res);
        }

        return;
    }

    


  
}