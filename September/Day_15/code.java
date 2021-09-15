package September.Day_15;
import java.util.*;


//1. Stock buy and sell 
//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1/?track=md-arrays&batchId=144


    class Solution{
        //Function to find the days of buying and selling stock for max profit.
        ArrayList<ArrayList<Integer>> stockBuySell(int a[], int n) {
            // code here
         ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
         
         for(int i=1;i<n;i++)
         {
            if(a[i]>=a[i-1]){
                ArrayList<Integer> interval=new ArrayList<>();
                interval.add(i-1);
                interval.add(i);
                ans.add(interval);
            }    
         }
         return ans;
        }


//JUMP GAME
//https://practice.geeksforgeeks.org/problems/jump-game/1/?track=md-arrays&batchId=144#

     static int canReach(int[] A, int N) 
    {
        // code here
        int reachable=0;
        
        for(int i=0;i<N;i++)
        {
             if(i>reachable)
             {
                 return 0;
             }
             else
             {
               reachable= Math.max(reachable,i+A[i]); 
               
               
             }
        }
        return 1;
    }


    //Equilibrium Point 
    //https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1/?track=md-arrays&batchId=144#


    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum=0;
        int leftsum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            sum-=arr[i];
            
            if(leftsum==sum){
                return i+1;
            }
            leftsum+=arr[i];
        }
        return -1;
    }


    //Rearrange Array Alternately 
    //https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1/?track=md-arrays&batchId=144

    public static void rearrange(int arr[], int n){
        
        // Your code here
        int temp[]= arr.clone();
        int left=0;
        int right=n-1;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
             if (flag)
             {
                arr[i] = temp[right];
                right--;
             }    
            else
            {
                arr[i] = temp[left];
                left++;
            }
            flag = !flag;
        }    
        
    }
    }  

