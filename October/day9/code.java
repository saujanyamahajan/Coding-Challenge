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


//79. Word Search
//https://leetcode.com/problems/word-search/


class Solution3{
    public boolean exist(char[][] board, String word) 
    {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (board[i][j] == word.charAt(0) && isFound(board, i, j, word, 0))
                    return true;

            return false;
        }

     private boolean isFound(char[][] board, int i, int j, String word, int index) {
            if (index == word.length())
                return true;
            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
                return false;
            if (word.charAt(index) != board[i][j])
                return false;
            char temp = board[i][j];
            board[i][j] = '*';
         
         
            if (isFound(board, i + 1, j, word, index + 1) ||
                    isFound(board, i - 1, j, word, index + 1) ||
                    isFound(board, i, j + 1, word, index + 1) ||
                    isFound(board, i, j - 1, word, index + 1))
                return true;
            board[i][j] = temp;
            return false;
    }
}

//36. Valid Sudoku
//https://leetcode.com/problems/valid-sudoku/


class Solution5 {
    public boolean isValidSudoku(char[][] board)
    {
        Set occured = new HashSet();
        for (int i=0; i<9; ++i)
        {
            for (int j=0; j<9; ++j) 
            {
                if (board[i][j] != '.')
                {
                    String b = "(" + board[i][j] + ")";
                    if (!occured.add(b + i) || !occured.add(j + b) ||                                           !occured.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
    return true;
    }
}