package October.day10;



//387. First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/


class Solution {
    public int firstUniqChar(String s)
    {
        int[] freq=new int[26];
        for(char c :s.toCharArray())
        {
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;    
            }
        }
        return -1;
    }
}


//383. Ransom Note
//https://leetcode.com/problems/ransom-note/


class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        int[] freq=new int[26];
        
        for(char c:magazine.toCharArray())
        {
            ++freq[c-'a'];
        }
        for(char c:ransomNote.toCharArray())
        {
            if(--freq[c-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}



//242. Valid Anagram
//https://leetcode.com/problems/valid-anagram/


class Solution3 {
    public boolean isAnagram(String s, String t) 
    {
        int[] freq=new int[26];
        
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
            freq[c-'a']--;
        }
        for(int i:freq)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}



//Anagram 
//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1#


class Solution4
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int[] freq=new int[26];
    
        for(char c:a.toCharArray())
        {
            freq[c-'a']++;
        }
        
        for(char c:b.toCharArray())
        {
            freq[c-'a']--;
        }
        
        for(int i:freq)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}