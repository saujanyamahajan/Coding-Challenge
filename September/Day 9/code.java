import java.util.*;

class Solution{

    //1.Subset Sums
    //https://practice.geeksforgeeks.org/problems/subset-sums2234/1

    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
    ArrayList<Integer> subsetsum=new ArrayList<Integer>();
    find(0,0,arr,n,subsetsum);
    Collections.sort(subsetsum);
    return subsetsum;
    }
    
    void find(int idx,int sum,ArrayList<Integer> arr, int n,ArrayList<Integer> subsetsum)
    {
        if(idx==n){
            subsetsum.add(sum);
            return ; 
        }
        
        find(idx+1,sum+arr.get(idx),arr,n,subsetsum);
        find(idx+1,sum,arr,n,subsetsum);
    }   
    
    
    //2.Unique Subsets 
    //https://leetcode.com/problems/subsets-ii/


    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        find(0,arr,new ArrayList<>(),ans);
        return ans;
    }
    static void find(int idx,int arr[], ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>ans)
    {
        ans.add(new ArrayList<>(ds));
        for (int i=idx;i<arr.length;i++)
        {
            if(i!=idx && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            find(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
        
    }
    
}