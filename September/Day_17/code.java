package September.Day_17;
import java.util.*;
public class code {
    

    //8. Plus One 
    //https://practice.geeksforgeeks.org/problems/plus-one/0/?track=md-arrays&batchId=144#


    static ArrayList<Integer> increment(ArrayList<Integer> arr , int n) 
    {
        // code here
             // ArrayList<Integer> ans=new ArrayList<Integer>();
              int i = n-1;
              while(i>=0){
                  if (arr.get(i)== 9) 
                  {
                    arr.set(i,0); 
                  }
                  else{
                    arr.set(i, arr.get(i) + 1);
                    
                    return arr;
                  }
                  i--;
              }
             
              //ArrayList<Integer> res =new ArrayList<Integer>();
              arr.add(0,1);
              return arr ;
    }


    //164. Maximum Gap
    //https://leetcode.com/problems/maximum-gap/


    public int maximumGap(int[] nums) {
      if(nums.length<2)
   {
       return 0;
   }
   int min=nums[0], max=0;
   
   for(int ele:nums)
   {
      min=Math.min(min,ele);    
      max=Math.max(max,ele);    
   }
   int interval=(int)Math.ceil((max-min+0.0)/(nums.length-1));
   
   int[] bucketMin=new int[(nums.length-1)];
   int[] bucketMax=new int[(nums.length-1)];
   
   Arrays.fill(bucketMin,Integer.MAX_VALUE);
   Arrays.fill(bucketMax,-1);
   
   for(int i=0;i<nums.length;i++)
   {
       if(nums[i]==min||nums[i]==max)continue;
       
       int index=(nums[i]-min)/interval;
       bucketMin[index]=Math.min(bucketMin[index],nums[i]);
       bucketMax[index]=Math.max(bucketMax[index],nums[i]);
   }
   
   int prev=min;
   int maxGap=0;
   
   for(int i=0;i<bucketMin.length;i++)
   {
      if(bucketMax[i]==-1)continue;
      maxGap=Math.max(bucketMin[i]-prev,maxGap);
      prev=bucketMax[i];
   }
   
   maxGap=Math.max(max-prev,maxGap);
   return maxGap;
  }
}
