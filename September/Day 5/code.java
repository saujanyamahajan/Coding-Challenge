package September.Day 4;

import java.util.*;


class Solution {


    //1.  4-Sum 
    //https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(a==null||a.length==0)
            return res;
        
        int n=a.length;
        Arrays.sort(a);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 int target=k-a[i]-a[j];
                 int left=j+1;
                 int right=n-1;
                 while(left<right){
                    int sum=a[left]+a[right];
                        if(sum<target)
                            left++;
                        else if(sum>target)
                            right--;
                        else{
                        ArrayList<Integer> quad=new ArrayList<>(); 
                        quad.add(a[i]);
                        quad.add(a[j]);
                        quad.add(a[left]);
                        quad.add(a[right]);
                        res.add(quad);
                        while(left<right && a[left]==quad.get(2))
                            ++left;
                        while(left<right && a[right]==quad.get(3))
                            --right;
                            
                        }
                     }
                        while(j+1<n && a[j+1]==a[j])
                            ++j;
            }
                        while(i+1<n && a[i+1]==a[i])
                            ++i;
                     
        }
       return res; 
    }
}