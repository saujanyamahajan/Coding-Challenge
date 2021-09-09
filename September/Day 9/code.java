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
    
}