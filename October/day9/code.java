package October.day9;
java.util.*;


//208. Implement Trie (Prefix Tree)
//https://leetcode.com/problems/implement-trie-prefix-tree/submissions/


class Trie {
    
    private Trie children[];
    private boolean isEndOfWord;
    
    public Trie() 
    {
        children=new Trie[26];
        isEndOfWord=false;
    }
    
    public void insert(String word)
    {
        Trie curr=this;
        for(char c: word.toCharArray())
        {
            if((curr.children[c-'a'])==null)
                curr.children[c-'a']=new Trie();
            curr=curr.children[c-'a'];
        }
        curr.isEndOfWord=true;
    }
    
    public boolean search(String word) 
    {
        Trie curr=this;
        for(char c: word.toCharArray())
        {
            curr=curr.children[c-'a'];
            if(curr==null)
                return false;
        }
        if(curr.isEndOfWord)  
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) 
    {
        Trie curr=this;
        for(char c: prefix.toCharArray())
        {
            curr=curr.children[c-'a'];
            if(curr==null)
                return false;
        }
            return true;
    }
}



//74. Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(target==matrix[i][j]){
                return true;
                }
            }
        } 
     return false;
    }
}