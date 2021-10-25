package October.day25;

//14. Longest Common Prefix
//https://leetcode.com/problems/longest-common-prefix/


class Solution {

    public String longestCommonPrefix(String[] str)
    {
        if(str.length==0)
        {
            return "";
        }
        String prefix=str[0];
        for(int i=0;i<str.length;i++)
        {
            while(str[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}


//2. Longest Common Prefix in an Array 
//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1/?track=md-string&batchId=144#


class Solution2{
    String longestCommonPrefix(String arr[], int n)
    {
        // code here
        if(arr.length==0)
        {
            return "-1";
        }
        
        String prefix=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix) !=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
            
        }
        if(prefix.length()==0)
        {
            return "-1";
        }
        else
        {
            return prefix;
        }
       
        //return prefix;
        
    }
}