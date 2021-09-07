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


    //3.Iterative Postorder Traversal using 2 Stack
    //https://leetcode.com/problems/binary-tree-postorder-traversal/

    public List<Integer> postorderTraversal(TreeNode root)
     {
        Stack<TreeNode> st1 = new Stack<TreeNode>(); 
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> ans = new ArrayList<Integer>();
        
        if(root == null)
        {
            return ans; 
        }
        
        st1.push(root); 
        while(!st1.isEmpty())
         {
            root = st1.pop(); 
            st2.add(root); 
            if(root.left != null) 
            {
                st1.push(root.left);
            } 
            if(root.right != null) 
            {
                st1.push(root.right); 
            }
        }
        while(!st2.isEmpty()) 
        {
            ans.add(st2.pop().val); 
        }
        return ans; 
    }
}