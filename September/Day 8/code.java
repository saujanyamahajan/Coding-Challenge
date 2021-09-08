package September.Day 8;

import java.util.*;

public class code {


    //1. Length of the longest substring 
    //https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1#
    
    
        int longestUniqueSubsttr(String s){
            HashMap <Character,Integer> map=new HashMap<>();
            int l=0,r=0;
            int n=s.length();
            int len=0;
            
            while(r<n){
                if(map.containsKey(s.charAt(r))){
                    l=Math.max(map.get(s.charAt(r))+1,l);
                }
                map.put(s.charAt(r),r);
                len=Math.max(len,r-l+1);
                r++;
            }
            return len;
        }
    
}
