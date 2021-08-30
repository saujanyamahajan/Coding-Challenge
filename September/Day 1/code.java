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
}

//2. Stock Span Problem
//

