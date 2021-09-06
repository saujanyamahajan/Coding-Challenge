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


    //3.Postorder Traversal 
    //https://practice.geeksforgeeks.org/problems/postorder-traversal/1


    static void dfs(Node node,ArrayList<Integer>ans)
    {
        if(node==null)
        {
            return;
        }
        dfs(node.left,ans);
        dfs(node.right,ans);
        ans.add(node.data);
        
    }
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> ans=new ArrayList<>();
       dfs(root,ans);
       return ans;
    }


    //4.Level order traversal 
    //https://practice.geeksforgeeks.org/problems/level-order-traversal/1#


    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        
        
        queue.add(node);
        
        while(!queue.isEmpty()){
           
            Node x=queue.peek();
                if(x.left!=null)
                {
                    queue.add(x.left);
                }
                if(x.right!=null)
                {
                    queue.add(x.right);
                    
                }
                
            ans.add(x.data);
            queue.poll();
            
        }
        return ans;
    }
}
}