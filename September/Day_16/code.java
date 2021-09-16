package September.Day_16;
import java.util.*;

public class code {
    
    //Leaders in an array 
    //https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1/?track=md-arrays&batchId=144#
    

  
        //Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int arr[], int n){
            // Your code here
          ArrayList<Integer> ans=new ArrayList<>();    
          int right_max=arr[n-1];
          ans.add(right_max);
           
          for (int i = n-1; i > 0; i--)
            { 
                 
                if (right_max <= arr[i-1])
                {          
                ans.add(arr[i-1]);
                right_max = arr[i-1];
                }
            }
           Collections.reverse(ans);
            return ans;
        }
    }

