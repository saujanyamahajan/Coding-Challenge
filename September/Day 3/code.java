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


    //2. maximum-rectangular-area-in-a-histogram
    //https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1#

    public static long[] nsr(long[] arr, long n){
        long[] res = new long[arr.length]; 
        Stack<Long> st = new Stack<>();
       // int x=(int)n;
        //st.push(n-1);
        
        res[arr.length-1]=arr.length;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(st.empty())
            {
               res[i]=n; 
            }
            else if(!st.empty() && arr[i]>arr[st.peek().intValue()])
            {
                res[i]=st.peek();                
            }
            else if(!st.empty() && arr[i]<=arr[st.peek().intValue()]){
                while(!st.empty() && arr[i]<=arr[st.peek().intValue()])
                {
                    st.pop();
                }
                if(st.empty())
                {
                    res[i]=n;
                }
                else
                {
                  res[i]=st.peek();  
                }
        }
            st.push((long)i);
        }
    return res;
    }
    
     public static long[] nsl(long[] arr, long n){
        long[] res = new long[arr.length]; 
        Stack<Long> st = new Stack<>();
        st.push((long)0);
        res[0]=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(st.empty())
            {
                res[i]=-1;
            }
            else if(!st.empty() && arr[i]>arr[st.peek().intValue()])
            {
                res[i]=st.peek();                
            }
            else if(!st.empty() && arr[i]<=arr[st.peek().intValue()]){
                while(!st.empty() && arr[i]<=arr[st.peek().intValue()])
                {
                    st.pop();
                }
                if(st.empty())
                {
                    res[i]=-1;
                }
                else
                {
                  res[i]=st.peek();  
                }
            }
            st.push((long)i);
        }
    return res;   
    }
    
    public static long getMaxArea(long h[], long n) 
    {
    long[] rs=new long[h.length];
    long[] ls=new long[h.length];
    long maxArea=0;
    
    rs=nsr(h,n);
    ls=nsl(h,n);
    
    for( int i=0;i<(int)n;i++)
    {
     long width=(rs[i]-ls[i])-1;
     long area=h[i]*width;
     if(area>maxArea)
     {
        maxArea=area;
     }
    }
    return maxArea;
    }


    //key pair
    //
    boolean hasArrayTwoCandidates(int num[], int n, int x) {
        // code here

        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            map.put(num[i],i);
        }
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(x-num[i]))
            {         
                map.remove(num[i],i);
                
                if(map.containsKey(x-num[i]))
                {
                   // res[0]=map.get(x-num[i]);
                    return true;
                }
            }
        }
        return false ;
    }

    
}
    

