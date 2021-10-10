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


class Solution {
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