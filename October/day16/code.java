java.util.*;
package October.day16;

//112. Path Sum
//https://leetcode.com/problems/path-sum/


class Solution1{
    public boolean hasPathSum(TreeNode root, int sum)
    {
        if (root == null)
        {
            return false;            
        }
        if (root.left == null && root.right == null && root.val == sum)
        {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum -root.val);

    }
}


//226. Invert Binary Tree
//https://leetcode.com/problems/invert-binary-tree/


class Solution2 {
    public TreeNode invertTree(TreeNode root)
    {
        if(root == null)
        {
            return null; 
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;    
    }
}


