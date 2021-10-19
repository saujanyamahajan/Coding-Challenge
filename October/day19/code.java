//46. Permutations
//https://leetcode.com/problems/permutations/


class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        helper(nums, ds,ans,freq);
        return ans;
    }
    public void helper(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] freq)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                helper(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    
}

//60. Permutation Sequence
//https://leetcode.com/problems/permutation-sequence/



class Solution2 {
    public String getPermutation(int n, int k) {
        
        int fact = 1; 
        List<Integer> numbers = new ArrayList<>(); 
        for(int i = 1;i<n;i++) {
            fact = fact * i; 
            numbers.add(i); 
        }
        numbers.add(n); 
        String ans = ""; 
        k = k - 1; 
        while(true) {
            ans = ans + numbers.get(k / fact); 
            numbers.remove(k / fact); 
            if(numbers.size() == 0) {
                break; 
            }
            
            k = k % fact; 
            fact = fact / numbers.size();
        }
        return ans; 
    }
}



//Flood fill Algorithm 
//https://practice.geeksforgeeks.org/problems/flood-fill-algorithm1856/1#



class Solution3
{
    public void helper(int[][] image, int sr, int sc, int newColor,int row,int col,int source)
    {
        if(sr<0 || sr>= row ||sc<0 ||sc>= col)
        {
            return;
        }
        else if(image[sr][sc]!=source)
        {
            return;
        }
        
        image[sr][sc]=newColor;
        
        helper(image,sr-1,sc,newColor,row,col,source); //top
        helper(image,sr+1,sc,newColor,row,col,source); //down
        helper(image,sr,sc-1,newColor,row,col,source); //left
        helper(image,sr,sc+1,newColor,row,col,source); //right
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        if(newColor==image[sr][sc])
        {
            return image;
        }
        int row=image.length;
        int col=image[0].length;
        int source= image[sr][sc];
        helper(image,sr,sc,newColor,row,col,source);
        return image;
    }
}


//Rat in a Maze Problem - I 
//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1


class Solution4{
    private static void solve(int i, int j, int m[][], int n, ArrayList<String> ans, String move, int vis[][])
    {
        if(i==n-1 && j==n-1)
        {
            ans.add(move);
            return; 
        }
       
        // downward
        if(i+1<n && vis[i+1][j] == 0 && m[i+1][j] == 1) 
        {
            vis[i][j] = 1; 
            solve(i+1, j, m, n, ans, move + 'D', vis);
            vis[i][j] = 0; 
        }
        
        // left
        if(j-1>=0 && vis[i][j-1] == 0 && m[i][j-1] == 1) 
        {
            vis[i][j] = 1; 
            solve(i, j-1, m, n, ans, move + 'L', vis);
            vis[i][j] = 0; 
        }
        
        // right 
        if(j+1<n && vis[i][j+1] == 0 && m[i][j+1] == 1)
        {
            vis[i][j] = 1; 
            solve(i, j+1, m, n, ans, move + 'R', vis);
            vis[i][j] = 0; 
        }
        
        // upward
        if(i-1>=0 && vis[i-1][j] ==0 && m[i-1][j] == 1) 
        {
            vis[i][j] = 1; 
            solve(i-1, j, m, n, ans, move + 'U', vis);
            vis[i][j] = 0; 
        }
    }

    public static ArrayList<String> findPath(int[][] m, int n) 
    {
        // Your code here
        int vis[][] = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                vis[i][j] = 0; 
            }
        }
         
        ArrayList<String> ans = new ArrayList<>(); 
        if(m[0][0] == 1) 
            solve(0, 0, m, n, ans, "", vis); 
            
        return ans; 

    }
}