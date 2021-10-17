package October.day17;

//437. Path Sum III
//https://leetcode.com/problems/path-sum-iii/


class Solution {
    public int pathSum(TreeNode root, int targetSum)
    {
        if(root==null)
        {
            return 0;
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        int[]count=new int[1];
        helper(root,targetSum,count,ans);
        return count[0];
    }
    public void helper(TreeNode root,int targetSum,int[] count,ArrayList<Integer>       ans)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.val);
        int sum=0;
        for(int i=ans.size()-1;i>=0;i--)
        {
            sum+=ans.get(i);
            if(sum==targetSum)
            {
                count[0]++;
            }
        }
        helper(root.left,targetSum,count,ans);
        helper(root.right,targetSum,count,ans);
        ans.remove(ans.size()-1);
    }
}