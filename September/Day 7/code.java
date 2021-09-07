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
}