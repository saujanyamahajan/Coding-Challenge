package September.Day 6;

import java.util.*;




class BinaryTree
{


    //1. Preorder Traversal 
    //https://practice.geeksforgeeks.org/problems/preorder-traversal/1#
    
    static void dfs(Node node,ArrayList<Integer> ans)
    {
        if(node==null){
            return;
        }
        ans.add(node.data);
        dfs(node.left,ans);
        dfs(node.right,ans);
    }
    
    
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ans= new ArrayList<>();
        dfs(root,ans);
        return ans;
    }



    //2.Inorder Traversal 
    //https://practice.geeksforgeeks.org/problems/inorder-traversal/1


    static void dfs(Node node,ArrayList<Integer> ans)
    {
        if(node==null){
            return;
        }
    dfs(node.left,ans);
    ans.add(node.data);
    dfs(node.right,ans);
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans=new ArrayList<>();
        
        dfs(root,ans);
        return ans;
    }
}