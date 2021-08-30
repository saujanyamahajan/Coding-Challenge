import java.util.*;

//1. Next Greater Element
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        Stack<Long> s = new Stack<>();
        long nge[] = new long[arr.length];
        for(int i=n-1;i>=0;i--)
        {
            if(s.empty())
            {
                nge[i]=-1;
            }
            else if(!s.empty() && s.peek()>arr[i])
            {
             nge[i]=s.peek();   
            }
            else if(!s.empty() && s.peek()<=arr[i])
            {
              while(!s.empty()&& s.peek()<=arr[i])
              {
                  s.pop();
              }  
              if(s.empty())
              {
                nge[i]=-1;
              }
              else
              {
                 nge[i]=s.peek();   
              }
            }
        s.push(arr[i]);
        }
        return nge;
    } 


//2. Stock Span Problem
//https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#

public static int[] calculateSpan(int price[], int n){
Stack<Integer> s=new Stack<>();
int[] span=new int[n];

span[0]=1;
s.push(0);

for(int i=1;i<n;i++)
{
    while(!s.empty() && price[i]>=price[s.peek()])
    {
        s.pop();
    }
    if(s.empty())
    {
        span[i]=i+1;
    }
    else
    {
        span[i]=i-s.peek();
    }
    s.push(i);
}
return span;
}

// 3.Smallest Number on left
//https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1


static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=n-1;i++)
        {
            if(s.empty())
            {
                ans.add(-1);
            }
            else if(!s.empty() && s.peek()<a[i])
            {
             ans.add(s.peek());   
            }
            else if(!s.empty() && s.peek()>=a[i])
            {
              while(!s.empty()&& s.peek()>=a[i])
              {
                  s.pop();
              }  
              if(s.empty())
              {
                ans.add(-1);
              }
              else
              {
                 ans.add(s.peek());   
              }
            }
        s.push(a[i]);
        }
        return ans;
    }


    
}