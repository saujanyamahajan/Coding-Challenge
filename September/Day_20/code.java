package September.Day_20;

public class code {
   

    //22. Max Circular Subarray Sum 
    //https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/0/?track=md-arrays&batchId=144

        static int circularSubarraySum(int a[], int n) {
            
            // Your code here
            int max_straight_sum=Integer.MIN_VALUE;
            int temp_max_sum=0;
            
            int min_straight_sum=Integer.MAX_VALUE;
            int temp_min_sum=0;
            
            int arraySum=0;
            
            for(int i=0;i<n;i++)
            {
                temp_max_sum+=a[i];
                max_straight_sum=Math.max(temp_max_sum,max_straight_sum);
                
                if(temp_max_sum<0)
                {
                    temp_max_sum=0;   
                }
                
                temp_min_sum+=a[i];
                min_straight_sum=Math.min(temp_min_sum,min_straight_sum);
               
                if(temp_min_sum>0)
                {
                    temp_min_sum=0;   
                }
                
                arraySum+=a[i];
                
            }
            
            if(min_straight_sum==arraySum)
            {
                return max_straight_sum;
            }
            else
            {
                return Math.max((arraySum-min_straight_sum),max_straight_sum);
            }
        }
        
    }
    
    

