package September.Day_14;

public class code
{



    //1. Sort an array of 0s, 1s and 2s 
    //https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/?track=md-arrays&batchId=144


    public static void swap(int a[], int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }
    public static void sort012(int a[], int n)
    {
        // code here 
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k)
        {
            if(a[i]==0)
            {
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[i]==1){
                i++;
            }
            else{
                swap(a,i,k);
                k--;
            }
        }


        //2.rotate an array
        //https://leetcode.com/problems/rotate-array/


    } public void reverse(int[] arr, int i,int j)
    {
       while(j>i)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
    }

    
    public void rotate(int[] arr, int k) 
    {
       k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }



    // 3. Best Time to Buy and Sell Stock

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


    public int maxProfit(int[] prices)
    {
        //BRUTE FORCE 
//         int diff=0;
//         int maxi=0;
//         for(int i=0;i<prices.length;i++)
//         {
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 diff=prices[j]-prices[i];
//                 maxi=Math.max(maxi,diff);

//             }
//         }
//         return maxi;
        
        //OPTIMAL
        
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];    
            }   
            else if(prices[i]-minprice>maxprofit)
            {
                maxprofit=prices[i]-minprice; 
            }
        }
        return maxprofit;
    }

}
