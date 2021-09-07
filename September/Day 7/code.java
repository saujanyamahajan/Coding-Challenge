package September.Day 6;

import java.util.*;


class Solution {


    //1.Iterative Preorder Traversal
    //https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/


    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
           
            if(root.right!=null){
                st.push(root.right);
            }
             if(root.left!=null){
                st.push(root.left);
            }
        }
        return ans;
    }


    //2.iterative Inorder Traversal
    //https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/


    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        Stack<TreeNode>st=new Stack<>();
        TreeNode node=root;
        
        while(true)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else
            {
                if(st.isEmpty())
                {
                    break;
                }
                node=st.pop();
                ans.add(node.val);
                node=node.right;
            }
        }
        return ans;
    }
}