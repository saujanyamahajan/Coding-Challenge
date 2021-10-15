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


class Solution1 {
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


class Solution2 {
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


//20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/

class Solution2 {
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}





