package September.Day_21;

public class cide {
   
    //17. Maximum value of difference of a pair of elements and their Index 
    //https://practice.geeksforgeeks.org/problems/maximum-value-of-difference-of-a-pair-of-elements-and-their-index/1/?track=md-arrays&batchId=144


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
