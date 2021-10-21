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