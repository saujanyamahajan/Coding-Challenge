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


    //118. Pascal's Triangle
    //https://leetcode.com/problems/pascals-triangle/


    class Solution2 {
        public List<List<Integer>> generate(int numRows)
        {
            List<List<Integer>> triangle = new ArrayList<List<Integer>>();
            if (numRows <=0){
                return triangle;
            }
            for (int i=0; i<numRows; i++){
                List<Integer> row =  new ArrayList<Integer>();
                for (int j=0; j<i+1; j++){
                    if (j==0 || j==i){
                        row.add(1);
                    } else {
                        row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                    }
                }
                triangle.add(row);
            }
            return triangle;
    
        }
    }


    //    566. Reshape the Matrix
    //https://leetcode.com/problems/reshape-the-matrix/


    class Solution3{
        public int[][] matrixReshape(int[][] mat, int r, int c) 
        {
            int m = mat.length, n = mat[0].length;
            if (r * c != m * n)
            {
                return mat; 
            }
            int[][] reshaped = new int[r][c];
            int ri = 0, cj = 0;
            for(int i=0; i<mat.length; ++i)
            {
                for(int j=0; j<mat[0].length; ++j)
                {
                    reshaped[ri][cj++] = mat[i][j];
                    if(cj >= reshaped[0].length)
                    {
                        cj = 0;
                        ri++;
                    }
                }
            }
        return reshaped;
        }
    }