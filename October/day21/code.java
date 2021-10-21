//M-Coloring Problem 
//https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#


class solve 
{
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    
    private static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) 
    {
        for(int ele: G[node]) 
        {
            if(color[ele] == col)
            {
                return false; 
            } 
        }
        return true; 
    }
     public static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m)
     {
        if(node == n)
        {
            return true; 
        }
        for(int i = 1;i<=m;i++)
        {
            if(isSafe(node, G, color, n, i)) 
            {
                color[node] = i;
                if(solve(node+1, G, color, n, m) == true)
                { 
                    return true; 
                }
                color[node] = 0;
            }
        }
        return false; 
    }
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C) 
    {
        // Your code here
        int n = G.length; 
        if(solve(0, G, color, n, C) == true)
        {
            return true;
        }  
        return false; 
    }
}


//51. N-Queens
//https://leetcode.com/problems/n-queens/


class Solution {
    public List<List<String>> solveNQueens(int n)
    {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n-1]; 
        int lowerDiagonal[] = new int[2*n-1]; 
        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
        return res;
    }
    
    public void solve(int col, char[][] board, List<List<String>> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) 
    {
        if(col == board.length)
        {
            res.add(construct(board));
            return;
        }
        
        for(int row = 0; row < board.length; row++)
        {
            if(leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiagonal[board.length -1 + col - row] == 0)
            {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[board.length-1 + col - row] = 1;
                solve(col+1, board, res, leftRow, lowerDiagonal, upperDiagonal );
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }
    
    public List<String> construct(char[][] board)
    {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++)
        {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}