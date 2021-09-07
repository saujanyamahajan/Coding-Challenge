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


    //4.Iterative Postorder Traversal using 1 Stack
    //https://leetcode.com/problems/binary-tree-postorder-traversal/

    Stack<TreeNode> st1 = new Stack<TreeNode>(); 
    List<Integer> postOrder = new ArrayList<Integer>();
    
    if(root == null) return postOrder; 
    
    TreeNode current = root;  
    while(current != null || !st1.isEmpty()) {
        if(current != null){
            st1.push(current);
            current = current.left;
        }else{
            TreeNode temp = st1.peek().right;
            if (temp == null) {
                temp = st1.pop();
                postOrder.add(temp.val);
                while (!st1.isEmpty() && temp == st1.peek().right) {
                    temp = st1.pop();
                    postOrder.add(temp.val);
                }
            } else {
                current = temp;
            }
        }
    }
  
    return postOrder; 
}

//5.Height of Binary Tree 
//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1#


int height(Node node) 
    {
        // code here 
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        
        return 1 + Math.max(rh,lh);
    }


    //6.Check for Balanced Tree
    //https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#

    boolean isBalanced(Node root)
    {
	// Your code here
	if(dfsHeight(root) == -1)
    {
        return false;
    }
    return true;
    }
   
    int dfsHeight (Node root)
    {
        if (root == null) 
        {
            return 0;
        }    
        
        int leftHeight = dfsHeight (root.left);
        if (leftHeight == -1)
        {
            return -1;
        } 
        
        int rightHeight = dfsHeight (root.right);
        if (rightHeight == -1)
        { 
            return -1;
        }
        
        if (Math.abs(leftHeight - rightHeight) > 1)
        {
            return -1;
        }    
        return Math.max(leftHeight, rightHeight) + 1;
    }


    //7.Diameter of Binary Tree 
    //https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1#


    int diameter(Node root) {
        // Your code here
        int[] maxi = new int[1];
        height(root, maxi);
        return maxi[0];        
    }
    
    int height(Node node, int[] maxi) {
        
        if(node==null)
        {
            return 0;
        }
        int lh=height(node.left,maxi);
        int rh=height(node.right,maxi);
        
        maxi[0]=Math.max(maxi[0],lh+rh+1);
        
        return Math.max(lh,rh)+1;
    }
    
    
}