package October.day8;
import java.util.*;


//350. Intersection of Two Arrays II
//https://leetcode.com/problems/intersection-of-two-arrays-ii/


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer>helper =new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                j++;  
            }
            else if(nums1[i]<nums2[j])
            {
                i++;   
            }
            else
            {
                helper.add(nums1[i]);
                i++;
                j++;
            }
        }
        int n=helper.size();
        int[] res =new int[n];
        
        for(int z=0;z<n;z++)
        {
            res[z]=helper.get(z);
        }
            
        return res;
    }
}


//121. Best Time to Buy and Sell Stock
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


    class Solution1{
        public int maxProfit(int[] price)
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
            
            int maxProfit=0;
            int minPrice=price[0];
            
            for(int i=0;i<price.length;i++)
            {
                if(minPrice>price[i])
                {
                    minPrice=price[i];
                }
                if(maxProfit<price[i]-minPrice)
                {
                    maxProfit=price[i]-minPrice ;
                }
                 maxProfit=Math.max(maxProfit,price[i]-minPrice);
            }
            return maxProfit;
        }
        
        
    }
