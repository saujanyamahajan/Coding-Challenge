package September.Day 8;

import java.util.*;

public class code {


    //1. Length of the longest substring 
    //https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1#
    
    
        int longestUniqueSubsttr(String s){
            HashMap <Character,Integer> map=new HashMap<>();
            int l=0,r=0;
            int n=s.length();
            int len=0;
            
            while(r<n){
                if(map.containsKey(s.charAt(r))){
                    l=Math.max(map.get(s.charAt(r))+1,l);
                }
                map.put(s.charAt(r),r);
                len=Math.max(len,r-l+1);
                r++;
            }
            return len;
        }
    


        //2. Max rectangle 
        //https://practice.geeksforgeeks.org/problems/max-rectangle/1#


        public static int[] nsr(int[] arr){
            int[] res = new int[arr.length]; 
            Stack<Integer> st = new Stack<>();
           // int x=(int)n;
            //st.push(n-1);
            
            res[arr.length-1]=arr.length;
            for(int i=arr.length-1;i>=0;i--)
            {
                if(st.empty())
                {
                   res[i]=arr.length; 
                }
                else if(!st.empty() && arr[i]>arr[st.peek()])
                {
                    res[i]=st.peek();                
                }
                else if(!st.empty() && arr[i]<=arr[st.peek()]){
                    while(!st.empty() && arr[i]<=arr[st.peek()])
                    {
                        st.pop();
                    }
                    if(st.empty())
                    {
                        res[i]=arr.length;
                    }
                    else
                    {
                      res[i]=st.peek();  
                    }
            }
                st.push(i);
            }
        return res;
        }
        
         public static int[] nsl(int[] arr){
            int[] res = new int[arr.length]; 
            Stack<Integer> st = new Stack<>();
            st.push(0);
            res[0]=-1;
            for(int i=1;i<arr.length;i++)
            {
                if(st.empty())
                {
                    res[i]=-1;
                }
                else if(!st.empty() && arr[i]>arr[st.peek()])
                {
                    res[i]=st.peek();                
                }
                else if(!st.empty() && arr[i]<=arr[st.peek()]){
                    while(!st.empty() && arr[i]<=arr[st.peek()])
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
                st.push(i);
            }
        return res;   
        }
        
        public static int MAH(int h[]) 
        {
            int[] rs=new int[h.length];
            int[] ls=new int[h.length];
            int maxArea=0;
            
            rs=nsr(h);
            ls=nsl(h);
            
            for( int i=0;i<h.length;i++)
            {
             int width=(rs[i]-ls[i])-1;
             int area=h[i]*width;
             if(area>maxArea)
                {
                    maxArea=area;
                }
            }
            return maxArea;
        }
        
        public int maxArea(int arr[][], int n, int m) {
            int[] ans=new int[m];
            for(int j=0;j<m;j++)
            {
                ans[j] = arr[0][j];
            }
            int maxi=MAH(ans);
            
            
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(arr[i][j]==1){
                        ans[j]++;
                    }
                    else
                    {
                        ans[j]=0;
                    }
                    //ans[j] = arr[0][j];
                }
            maxi=Math.max(maxi,MAH(ans));
            }
            return maxi;
        }
}
