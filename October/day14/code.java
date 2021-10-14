package October.day14;


//232. Implement Queue using Stacks
//https://leetcode.com/problems/implement-queue-using-stacks/


class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer>ip=new Stack();
    Stack<Integer>op=new Stack();

    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        ip.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
     if(op.empty()){
         while(ip.empty()==false){
             op.push(ip.peek());
             ip.pop();
         }
     }   
        int x=op.peek();
        op.pop();
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
           if(op.empty()){
         while(ip.empty()==false){
             op.push(ip.peek());
             ip.pop();
         }
     }   
        return op.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return op.empty() && ip.empty();
    }
}



//144. Binary Tree Preorder Traversal
//https://leetcode.com/problems/binary-tree-preorder-traversal/


class Solution {
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


// Binary Tree Inorder Traversal
//https://leetcode.com/problems/binary-tree-inorder-traversal/


class Solution {
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