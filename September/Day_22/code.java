class Solution {

    //13. Remove Duplicates 
    //https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?track=md-string&batchId=144


    String removeDups(String S) {
        // code here
        String str = new String();
        int len = S.length();
          
        for (int i = 0; i < len; i++) 
        {
            char c = S.charAt(i);
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
          
        return str;
    }


        //12. Allocate minimum number of pages 
        //https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/?track=md-searching&batchId=144


        public static Boolean isPossible(int[]A,int pages,int M)
    {
        int count=0;
        int sumAllocated=0;
        for(int i=0;i<A.length;i++)
        {
            if(sumAllocated+A[i]>pages)
            {
                count++;
                sumAllocated=A[i];
                if(sumAllocated>pages)
                {
                    return false;
                }
            }
            else{
                sumAllocated+=A[i];
            }
        }
        if(count<M)
        {
            return true;
        }
        return false;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M>N)
        {
        return -1;
        }
        int low=A[0];
        int high=0;
        for(int i=0;i<N;i++)
        {
            high=high+A[i];
            low=Math.min(low,A[i]);
        }
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(A,mid,M))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}
}