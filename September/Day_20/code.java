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
        

        //4. Median of Two Sorted Arrays
        //https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/


        public double findMedianSortedArrays(int[] num1, int[] num2) {
            if(num2.length<num1.length)
           {
              return findMedianSortedArrays(num2,num1);
           }
           
           int n1=num1.length;
           int n2=num2.length;
           
           int low=0,high=n1;
           
           while(low<=high){
               int cut1=(low+high)>>1;
               int cut2=(n1+n2+1)/2-cut1;
               
               int l1=cut1==0?Integer.MIN_VALUE:num1[cut1-1];
               int l2=cut2==0?Integer.MIN_VALUE:num2[cut2-1];
               
               int r1=cut1==n1?Integer.MAX_VALUE:num1[cut1];
               int r2=cut2==n2?Integer.MAX_VALUE:num2[cut2];
               
               if(l1<=r2 && l2<=r1)
               {
                   if((n1+n2)%2==0)
                   {
                      return (Math.max(l1,l2)+Math.min(r1,r2))/2.0; 
   
                   }
                   else
                   {
                      return Math.max(l1,l2); 
                   }
               }
               else if(l1>r2)
               {
                   high=cut1-1; 
               }
               else
               {
                   low=cut1+1;
               }   
           }
           return 0.0;
       }

    //19. K-th element of two sorted Arrays 
    //https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1/?track=md-arrays&batchId=144


       public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        if(n>m)
        {
            return kthElement(arr2,arr1,m,n,k);
        }
        int low=Math.max(0,k-m),high=Math.min(k,n);
        
        while(low<=high)
        {
            int cut1=(low+high)/2;
            int cut2=k-cut1;
            
            int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            
            int r1=cut1==n?Integer.MAX_VALUE:arr1[cut1];
            int r2=cut2==m?Integer.MAX_VALUE:arr2[cut2];
            
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                high=cut1-1;
            }
            else
            {
                low=cut1+1;
            }
        }
        return 1;
    }
    }
    
    

