package September.Day_21;

public class cide {
   
    //17. Maximum value of difference of a pair of elements and their Index 
    //https://practice.geeksforgeeks.org/problems/maximum-value-of-difference-of-a-pair-of-elements-and-their-index/1/?track=md-arrays&batchId=144

    static int maxValue(int[] arr, int N) {
        // code here
        
        
        //brute force
        // int ans = 0;

        // for(int i = 0; i<N; i++)
        // {
        //     for(int j = i+1; j<N; j++)
        //     {
        //         ans = Math.max(ans, Math.abs(arr[i]-arr[j])+Math.abs(i-j));
        //     }
        // }
        // return ans;
    int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++)
        {
            max1 = Math.max(max1, (arr[i]+i));
            min1 = Math.min(min1, (arr[i]+i));

            max2 = Math.max(max2, (i-arr[i]));
            min2 = Math.min(min2, (i-arr[i]));
        }

        int ans = Math.max(max1-min1, max2-min2);

        return ans;

}


//14. Maximize Number of 1's 
//https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1/?track=md-arrays&batchId=144


    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int ans=0;
        int j=-1;
        int count=0;
        
        for(int i=0;i<n;i++) 
        {
            if(arr[i]==0)
            {
                count++;
            }
            while(count>m)
            {
                j++;
                if(arr[j]==0)
                {
                    count--;
                }
            }
            int len=i-j;
            if(len>ans)
            {
                ans=len;
            }
        }
                return ans;
    }


    //1. Binary Search 
    //https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/?track=md-searching&batchId=144#

    int binarysearch(int arr[], int n, int k){
        // code here
         int l = 0, r = arr.length - 1;
         
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            if (arr[m] == k)
            {
                return m;
            }
            if (arr[m] < k)
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }    
        }
  
      
        return -1;
    }


    //2. Search insert position of K in a sorted array 
    //https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/0/?track=md-searching&batchId=144

    static int searchInsertK(int arr[], int n, int k)
    {
      
        // code here
        for(int i=0;i<n;i++)
        {
        if (arr[i]==k)
        {
            return i;
        }
        else if (arr[i]>k)
        {
            return i;
        }
    }
    return n;
    }



    //7. Square root of a number 
    //https://practice.geeksforgeeks.org/problems/square-root/1/?track=md-searching&batchId=144#


    long floorSqrt(long x)
    {
       // Your code here
       long l =0;
       long h = x;
       
       long res =0;
       while(l<=h)
       {
           long mid = l + (h-l)/2;
           
           if(mid*mid==x)
           return mid;
           
           if(mid*mid<x)
           {
              l = mid+1;
              res = mid;
           }
           else
           {
               h = mid-1;
           }
       }
       return res;
    }


    //1. Wave Array
    //https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/?track=md-sorting&batchId=144

    
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
    
}

